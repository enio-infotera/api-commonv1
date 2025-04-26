package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.client.InfotravelClient;
import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.dto.circuit.ApiBookingCircuit;
import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuit;
import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuitAvail;
import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuitCategory;
import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuitDay;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoom;
import br.com.infotravel.api.commonv1.enumerators.GenderType;
import br.com.infotravel.api.commonv1.enumerators.NameType;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.CircuitAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.CircuitAvailabilityRS;
import br.com.infotravel.api.commonv1.responses.CircuitCalendarRS;
import br.com.infotravel.api.commonv1.responses.CircuitDailyDetailRS;
import br.com.infotravel.api.commonv1.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteCircuito {

    private static final String username = "username";
    private static final String password = "password";
    private static final String client = "CLIENT_SG";
    private static final String agency = "2";
    private static final String language = "pt_br";

    private static final String baseUrl = "http://localhost:8080/infotravel/api/v1";
    private static InfotravelClient infotravelClient = new InfotravelClient(baseUrl);

    public static void main(String[] args) {
        testeCircuito();
    }

    public static void testeCircuito() {
        try {
            ApiToken token = chamaAuthentication();
            System.out.println("Token obtido: " + token.getAccessToken());

            String searchDate = "2025-10-01"; // Agosto 2025
            String destinationCode = "41"; // Espanha (infotera_id)

            // Chama a pesquisa
            CircuitAvailabilityRQ availabilityDestinationRQ = new CircuitAvailabilityRQ(destinationCode, searchDate);
            CircuitAvailabilityRS circuitAvailabilityRS = infotravelClient.circuitAvailability(availabilityDestinationRQ, token);

            if (circuitAvailabilityRS != null && circuitAvailabilityRS.getApiCircuitAvailList() != null && !circuitAvailabilityRS.getApiCircuitAvailList().isEmpty()) {
                for (ApiCircuitAvail avail : circuitAvailabilityRS.getApiCircuitAvailList()) {
                    System.out.println("Circuito: '" + avail.getCircuit().getCode() + "' - '" + avail.getCircuit().getName() + " '" + avail.getProvider() + "'");
                }

                // Pega o primeiro circuito
                ApiCircuitAvail apiCircuitAvail = circuitAvailabilityRS.getApiCircuitAvailList().get(0);
                System.out.println("Circuito escolhido '" + apiCircuitAvail.getCircuit().getCode() + "' '" + apiCircuitAvail.getCircuit().getName() + " '" + apiCircuitAvail.getProvider() + "'");

                // Monta o request do calendario
                ApiBooking requestCalendar = montaBookingCircuitoAvail(apiCircuitAvail, Utils.toDate(searchDate, "yyyy-MM-dd"));
                ApiBookingCircuit responseCalendar = chamaCalendario(requestCalendar, token);

                if (responseCalendar != null && !Utils.isListNothing(responseCalendar.getDates())) {

                    for (ApiCircuitDay apiCircuitDay : responseCalendar.getDates()) {
                        System.out.println("Dia disponível: " + apiCircuitDay.getStart() + " - Categoria: " + apiCircuitDay.getCategory().getCode());
                    }

                    // Pega o primeiro dia
                    ApiCircuitDay circuitDay = responseCalendar.getDates().get(0);

                    // Monta o request do detalhe do dia
                    ApiBooking requestDaily = montaDailyDetail(responseCalendar, circuitDay.getStart());
                    ApiBookingCircuit responseDaily = chamaDailyDetail(requestDaily, token);

                    if (responseDaily != null && responseDaily.isAvailable()) {
                        if (responseDaily.getCancellationPolicies().isImmediateFine() || !responseDaily.getCancellationPolicies().isRefundable()) {
                            throw new RuntimeException("O primeiro circuito retornado tem politica de cancelamento não reembolsavel.");
                        }

                        // Monta o request do checkRate    
                        ApiBooking requestCheckRate = montaBookingCheckRate(responseDaily);
                        ApiBooking responseCheckRate = chamaCheckRate(requestCheckRate, token);

                        // Caso retorne ok o checkRate, faz a reserva
                        if (responseCheckRate.getBookingCircuits() != null && !responseCheckRate.getBookingCircuits().isEmpty()) {

                            // Cria a reserva
                            ApiBooking requestBooking = montaBooking(responseCheckRate);
                            ApiBooking responseBooking = chamaBooking(requestBooking, token);
                            System.out.println("BOOKING '" + responseBooking.getId() + "' STATUS '" + responseBooking.getStatus().name() + "' ");

                            Thread.sleep(5000);
                            // Consulta a reserva após um tempinho
                            ApiBooking findBookingResponse = buscaBooking(responseBooking.getId(), token);
                            System.out.println("FIND BOOKING '" + findBookingResponse.getId() + "' STATUS '" + findBookingResponse.getStatus().name() + "' ");
                        }
                    } else {
                        System.out.println("Dia '" + responseCalendar.getDates().get(0).getStart() + "' não disponível");
                    }
                } else {
                    System.out.println("Calendario não disponível para data: " + searchDate);
                }
            } else {
                System.out.println("no availability");
            }
        } catch (ApiException ex) {
            Logger.getLogger(TesteCircuito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteCircuito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TesteCircuito() {
    }

    public static ApiToken chamaAuthentication() throws ApiException {
        AuthenticationRQ authenticationRQ = new AuthenticationRQ(username, password, agency, client, language);

        ApiToken token = infotravelClient.authenticate(authenticationRQ);
        return token;
    }

    public static ApiBookingCircuit chamaCalendario(ApiBooking booking, ApiToken token) throws ApiException {
        CircuitCalendarRS rs = infotravelClient.circuitCalendar(new BookingRQ(booking), token);
        return rs.getBookingCircuit();
    }

    public static ApiBookingCircuit chamaDailyDetail(ApiBooking booking, ApiToken token) throws ApiException {
        CircuitDailyDetailRS rs = infotravelClient.circuitDailyDetails(new BookingRQ(booking), token);
        return rs.getBookingCircuit();
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

    public static ApiBooking montaBookingCircuitoAvail(ApiCircuitAvail circuitAvail, Date dateSelected) {
        ApiBooking booking = new ApiBooking();
        if (circuitAvail != null) {

            //pega primeiro quarto da listagem, exemplo com 1 quarto
            ApiRoom apiRoom = circuitAvail.getRoomGroups().get(0).getRooms().get(0);
            apiRoom.setNames(new ArrayList<>());

            switch (apiRoom.getRoomType().getCode()) {
                case "SGL-Single":
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    break;
                case "DBL-Double":
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    break;
                case "TPL-Triple":
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    apiRoom.getNames().add(new ApiName(NameType.ADT, 30, GenderType.MALE));
                    break;
                default:
                    throw new RuntimeException("Tipo de quarto '" + apiRoom.getRoomType().getCode() + "' não mapeado. ");
            }

            ApiBookingCircuit bookingCircuit = new ApiBookingCircuit(new ApiCircuit(circuitAvail.getCircuit().getKey()), Arrays.asList(apiRoom));
            bookingCircuit.setDateSelected(dateSelected);
            booking.setBookingCircuits(Arrays.asList(bookingCircuit));
        }
        return booking;
    }

    public static ApiBooking montaDailyDetail(ApiBookingCircuit circuitBooking, Date dateSelected) {
        ApiBooking booking = new ApiBooking();
        if (circuitBooking != null) {

            ApiBookingCircuit bookingCircuit = new ApiBookingCircuit(new ApiCircuit(circuitBooking.getCircuit().getKey()), circuitBooking.getRooms());
            bookingCircuit.setDateSelected(dateSelected);

            booking.setBookingCircuits(Arrays.asList(bookingCircuit));
        }
        return booking;
    }

    public static ApiBooking montaBookingCheckRate(ApiBookingCircuit bookingCircuit) {
        ApiBooking booking = new ApiBooking();

        ApiCircuitCategory category = bookingCircuit.getCategories().get(0);

        // monta objeto de bookings limpo para a chamada do /checkRate
        ApiBookingCircuit apiBookingCircuitCheckRate = new ApiBookingCircuit(
                new ApiCircuit(bookingCircuit.getCircuit().getKey()),
                bookingCircuit.getRooms(),
                new ApiCircuitCategory(category.getId(), category.getCode(), category.getName())
        );

        booking.setBookingCircuits(Arrays.asList(apiBookingCircuitCheckRate));

        return booking;
    }

    public static ApiBooking montaBooking(ApiBooking checkRateBooking) {
        ApiBooking booking = new ApiBooking();
        booking.setId(checkRateBooking.getId());

        //IMPLEMENTA CONTATO
        booking.setContact(new ApiContact("Teste da silva", "teste@teste.com.br", "11942232322"));

        if (checkRateBooking.getBookingCircuits() != null && !checkRateBooking.getBookingCircuits().isEmpty()) {

            ApiBookingCircuit apiBookingCircuitCheckRate = checkRateBooking.getBookingCircuits().get(0);

            // monta objeto de bookings limpo para a chamada do /booking
            ApiBookingCircuit bookingCircuit = new ApiBookingCircuit(
                    new ApiCircuit(apiBookingCircuitCheckRate.getCircuit().getKey()),
                    apiBookingCircuitCheckRate.getRooms()
            );

            // Preenche os nomes dos pax para fazer a reserva
            for (ApiRoom room : bookingCircuit.getRooms()) {
                preencheNome(room.getNames());
            }

            booking.setBookingCircuits(Arrays.asList(bookingCircuit));
        }

        return booking;
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

}
