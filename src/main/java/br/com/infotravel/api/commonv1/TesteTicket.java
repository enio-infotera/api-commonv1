/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.client.InfotravelClient;
import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.dto.ticket.ApiBookingTicket;
import br.com.infotravel.api.commonv1.dto.ticket.ApiTicket;
import br.com.infotravel.api.commonv1.dto.ticket.ApiTicketAvail;
import br.com.infotravel.api.commonv1.dto.ticket.ApiTicketDate;
import br.com.infotravel.api.commonv1.dto.ticket.ApiTicketModalitie;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.TicketAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.TicketAvailbilityRS;
import br.com.infotravel.api.commonv1.utils.Utils;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enioj
 */
public class TesteTicket {

    private static final String username = "username";
    private static final String password = "password";
    private static final String client = "CLIENT_SG";
    private static final String agency = "2";
    private static final String language = "pt_br";

    private static final String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
    private static InfotravelClient infotravelClient = new InfotravelClient(baseUrl);

    public static void main(String[] args) {
        testTicket();
    }

    public static void testTicket() {
        try {
            ApiToken token = chamaAuthentication();
            System.out.println("Token obtido: " + token.getAccessToken());

            // Chama a pesquisa para são paulo id: 2802
            TicketAvailabilityRQ ticketAvailabilityRQ = new TicketAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2802", null);
            TicketAvailbilityRS ticketAvailbilityRS = infotravelClient.ticketAvail(ticketAvailabilityRQ, token);

            if (ticketAvailbilityRS.getTicketAvails() != null && !ticketAvailbilityRS.getTicketAvails().isEmpty()) {

                // Pega o primeiro ingresso retornado
                ApiTicketAvail ticketAvail = ticketAvailbilityRS.getTicketAvails().get(0);

                // Verifica se o ingresso tem modalidade
                if (ticketAvail.getModalities() != null && !ticketAvail.getModalities().isEmpty()) {

                    // Monta o request do checkRate
                    ApiBooking requestCheckRate = montaBookingTicketAvail(ticketAvail);
                    ApiBooking responseCheckRate = chamaCheckRate(requestCheckRate, token);

                    // Caso retorne ok o checkRate, faz a reserva
                    if (responseCheckRate.getBookingTickets() != null && !responseCheckRate.getBookingTickets().isEmpty()) {
                        // Cria a reserva
                        ApiBooking requestBooking = montaBooking(responseCheckRate);
                        ApiBooking responseBooking = chamaBooking(requestBooking, token);
                        System.out.println("BOOKING '" + responseBooking.getId() + "' STATUS '" + responseBooking.getStatus().name() + "' ");

                        // Consulta a reserva após um tempinho
                        Thread.sleep(5000);
                        ApiBooking findBookingResponse = buscaBooking(responseBooking.getId(), token);
                        System.out.println("FIND BOOKING '" + findBookingResponse.getId() + "' STATUS '" + findBookingResponse.getStatus().name() + "' ");
                    }
                } else {
                    System.out.println("No modalities");
                }
            } else {
                System.out.println("no availability");
            }
        } catch (ApiException ex) {
            Logger.getLogger(TesteTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ApiToken chamaAuthentication() throws ApiException {
        AuthenticationRQ authenticationRQ = new AuthenticationRQ(username, password, agency, client, language);

        ApiToken token = infotravelClient.authenticate(authenticationRQ);
        return token;
    }

    public static ApiBooking chamaCheckRate(ApiBooking booking, ApiToken token) throws ApiException {
        BookingRS rs = infotravelClient.checkRate(new BookingRQ(booking), token);
        return rs.getBooking();
    }

    public static ApiBooking chamaBooking(ApiBooking booking, ApiToken token) throws ApiException {
        BookingRS rs = infotravelClient.booking(new BookingRQ(booking), token);

        return rs.getBooking();
    }

    public static ApiBooking buscaBooking(Integer bookingId, ApiToken token) throws ApiException {
        ApiBooking rs = infotravelClient.findBooking(bookingId, token);

        return rs;
    }

    public static void preencheNome(List<ApiName> names) {
        ApiName name = names.get(0);
        name.setFirstName("JOAO");
        name.setLastName("SILVA");
        name.setBirth(Utils.toDate("1987-12-01", "yyyy-MM-dd"));
        name.setAge(36);

        name = names.get(1);
        name.setFirstName("MARIA");
        name.setLastName("SILVA");
        name.setBirth(Utils.toDate("1987-12-01", "yyyy-MM-dd"));
        name.setAge(36);
    }

    public static ApiBooking montaBookingTicketAvail(ApiTicketAvail ticketAvail) {
        ApiBooking booking = new ApiBooking();
        if (ticketAvail != null) {
            //pega primeira modalidade e data retornado
            ApiTicketModalitie apiTicketModalitieAvail = ticketAvail.getModalities().get(0);
            ApiTicketDate apiTicketDate = apiTicketModalitieAvail.getDates().get(0);

            // monta objeto de bookings
            ApiBookingTicket bookingTicket = new ApiBookingTicket(
                    new ApiTicket(ticketAvail.getTicket().getKey()),
                    ticketAvail.getNames(),
                    new ApiTicketModalitie(apiTicketModalitieAvail.getCode(), apiTicketModalitieAvail.getName(), apiTicketDate)
            );

            booking.setBookingTickets(Arrays.asList(bookingTicket));
        }
        return booking;
    }

    public static ApiBooking montaBooking(ApiBooking checkRateBooking) {
        ApiBooking booking = new ApiBooking();

        //IMPLEMENTA CONTATO
        booking.setContact(new ApiContact("Teste da silva", "teste@teste.com.br", "11942232322"));

        if (checkRateBooking.getBookingTickets() != null && !checkRateBooking.getBookingTickets().isEmpty()) {

            ApiBookingTicket apiBookingTicketCheckRate = checkRateBooking.getBookingTickets().get(0);

            // monta objeto de bookings limpo para a chamada do /booking
            ApiBookingTicket bookingTicket = new ApiBookingTicket(
                    new ApiTicket(apiBookingTicketCheckRate.getTicket().getKey()),
                    apiBookingTicketCheckRate.getNames()
            );

            // Preenche os nomes dos pax para fazer a reserva
            preencheNome(bookingTicket.getNames());

            booking.setBookingTickets(Arrays.asList(bookingTicket));
        }

        return booking;
    }

}
