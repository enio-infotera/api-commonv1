package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.client.InfotravelClient;
import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.dto.hotel.ApiBookingHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotelAvail;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoom;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import br.com.infotravel.api.commonv1.responses.HotelDetailRS;
import br.com.infotravel.api.commonv1.utils.Utils;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arquimedes
 */
public class TesteHotel {
    
    private static final String username = "username";
    private static final String password = "password";
    private static final String client = "CLIENT_SG";
    private static final String agency = "2";
    private static final String language = "pt_br";
    
    private static final String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
    private static InfotravelClient infotravelClient = new InfotravelClient(baseUrl);
    
    public static void main(String[] args) {
        testeHotel();
    }
    
    public static void testeHotel() {
        try {
            ApiToken token = chamaAuthentication();
            System.out.println("Token obtido: " + token.getAccessToken());

            // Chama a pesquisa para são paulo id: 2802
            HotelAvailabilityRQ availabilityDestinationRQ = new HotelAvailabilityRQ("2024-11-10", "2024-11-11", "2", "2802", null);
            HotelAvailbilityRS availabilityDestinationRS = infotravelClient.hotelAvailability(availabilityDestinationRQ, token);
            
            if (availabilityDestinationRS != null && availabilityDestinationRS.getApiHotelAvailList() != null && !availabilityDestinationRS.getApiHotelAvailList().isEmpty()) {
                for (ApiHotelAvail avail : availabilityDestinationRS.getApiHotelAvailList()) {
                    System.out.println("Hotel '" + avail.getHotel().getId() + "' '" + avail.getHotel().getName() + "' '" + avail.getProvider() + "'");
                }

                // Pega o primeiro hotel e chama o detalhe separado desse hotel
                ApiHotelAvail apiHotelAvailDestination = availabilityDestinationRS.getApiHotelAvailList().get(0);
                
                System.out.println("Hotel '" + apiHotelAvailDestination.getHotel().getId() + "' '" + apiHotelAvailDestination.getHotel().getName() + "' '" + apiHotelAvailDestination.getProvider() + "'");

                // Pesquisa pelo id do hotel
                HotelAvailabilityRQ availabilityHotelRQ = new HotelAvailabilityRQ("2024-11-10", "2024-11-11", "2", null, apiHotelAvailDestination.getHotel().getId().toString());
                HotelAvailbilityRS hotelAvailbilityRS = infotravelClient.hotelAvailability(availabilityHotelRQ, token);
                
                if (hotelAvailbilityRS.getApiHotelAvailList() != null && !hotelAvailbilityRS.getApiHotelAvailList().isEmpty()) {
                    
                    ApiHotelAvail hotelAvail = hotelAvailbilityRS.getApiHotelAvailList().get(0);

                    // Busca os detalhes do hotel como fotos, facilidades, descrições... pela keyDetail do hotel.
                    // Detalhes usados apenas para exibição em tela, não é necessário para criação da reserva.
                    HotelDetailRS hotelDetailResponse = infotravelClient.hotelDetail(hotelAvail.getHotel().getKeyDetail(), token);
                    System.out.println(hotelDetailResponse.getHotel().getImages());
                    
                    if (hotelAvail.getRoomGroups().get(0).getRooms().get(0).getCancellationPolicies().isImmediateFine()
                            || !hotelAvail.getRoomGroups().get(0).getRooms().get(0).getCancellationPolicies().isRefundable()) {
                        throw new RuntimeException("O primeiro hotel retornado tem politica de cancelamento não reembolsavel.");
                    }

                    // Monta o request do checkRate    
                    ApiBooking requestCheckRate = montaBookingHotelAvail(hotelAvail);
                    ApiBooking responseCheckRate = chamaCheckRate(requestCheckRate, token);

                    // Caso retorne ok o checkRate, faz a reserva
                    if (responseCheckRate.getBookingHotels() != null && !responseCheckRate.getBookingHotels().isEmpty()) {

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
                    System.out.println("no availability");
                }
            } else {
                System.out.println("no availability");
            }
        } catch (ApiException ex) {
            Logger.getLogger(TesteHotel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteHotel.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public static ApiBooking montaBookingHotelAvail(ApiHotelAvail hotelAvail) {
        ApiBooking booking = new ApiBooking();
        if (hotelAvail != null) {
            //pega primeiro quarto da listagem 
            ApiRoom apiRoom = hotelAvail.getRoomGroups().get(0).getRooms().get(0);
            ApiBookingHotel bookingHotel = new ApiBookingHotel(new ApiHotel(hotelAvail.getHotel().getId()), Arrays.asList(new ApiRoom(apiRoom.getKey(), apiRoom.getNames())));
            booking.setBookingHotels(Arrays.asList(bookingHotel));
        }
        return booking;
    }
    
    public static ApiBooking montaBooking(ApiBooking checkRateBooking) {
        ApiBooking booking = new ApiBooking();
        booking.setId(checkRateBooking.getId());
        
        //IMPLEMENTA CONTATO
        booking.setContact(new ApiContact("Teste da silva", "teste@teste.com.br", "11942232322"));
        
        if (checkRateBooking.getBookingHotels() != null && !checkRateBooking.getBookingHotels().isEmpty()) {
            
            ApiBookingHotel apiBookingHotelCheckRate = checkRateBooking.getBookingHotels().get(0);

            // monta objeto de bookings limpo para a chamada do /booking
            ApiBookingHotel bookingHotel = new ApiBookingHotel(
                    new ApiHotel(apiBookingHotelCheckRate.getHotel().getId()),
                    apiBookingHotelCheckRate.getRooms()
            );

            // Preenche os nomes dos pax para fazer a reserva
            for (ApiRoom room : bookingHotel.getRooms()) {
                preencheNome(room.getNames());
            }
            
            booking.setBookingHotels(Arrays.asList(bookingHotel));
        }
        
        return booking;
    }
    
}
