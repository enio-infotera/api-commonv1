/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.dto.hotel.ApiBookingHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotelAvail;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoom;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import br.com.infotravel.api.commonv1.utils.Utils;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author enioj
 */
public class Teste {

    private static String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
    private static HttpClientService httpClientService = new HttpClientService(baseUrl);

    public static void main(String[] args) {
        try {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void testeHotel() throws Exception {
        //monta token
        ApiToken token = chamaAuthentication();
        //monta request
        HotelAvailabilityRQ availabilityDestinationRQ = new HotelAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2705", null);
        HotelAvailbilityRS hotelAvailbilityRS = httpClientService.hotelAvailability(availabilityDestinationRQ, token.getAccessToken());
        if (hotelAvailbilityRS != null && hotelAvailbilityRS.getApiHotelAvailList() != null && !hotelAvailbilityRS.getApiHotelAvailList().isEmpty()) {
            for (ApiHotelAvail avail : hotelAvailbilityRS.getApiHotelAvailList()) {
                System.out.println("Hotel " + avail.getHotel().getName() + " " + avail.getProvider());
            }
            //MONTA BOOKING
            ApiBooking booking = montaBookingHotel(hotelAvailbilityRS.getApiHotelAvailList().get(0));
            booking = chamaCheckRates(booking, token.getAccessToken());
            //BOOKING
            chamaBooking(booking);
        }
    }

    public static ApiToken chamaAuthentication() throws Exception {
        AuthenticationRQ authenticationRQ = new AuthenticationRQ("123", "123", "2", "DEVELOP", "pt_br");
        ApiToken token = httpClientService.authenticate(authenticationRQ);
        return token;
    }

    public static ApiBooking chamaCheckRates(ApiBooking booking, String token) throws Exception {
        BookingRS rs = httpClientService.checkRates(new BookingRQ(booking), token);
        return rs.getBooking();
    }

    public static void chamaBooking(ApiBooking booking) {
        //IMPLEMENTA CONTATO
        booking.setContact(new ApiContact("Teste da silva", "teste@teste.com.br", "11942232322"));
        //IMPLEMENTA NOMES
        if (booking.getBookingHotels() != null) {
            for (ApiBookingHotel bookingHotel : booking.getBookingHotels()) {
                ApiRoom room = bookingHotel.getRooms().get(0);
                preencheNome(room.getNames());
            }
        }
    }

    public static void preencheNome(List<ApiName> names) {
        ApiName name = names.get(0);
        name.setFirstName("JOAO");
        name.setLastName("SILVA");
        name.setBirth(Utils.formatDate("01/12/1987"));
        name.setAge(36);
        name = names.get(1);
        name.setFirstName("MARIA");
        name.setLastName("SILVA");
        name.setBirth(Utils.formatDate("01/12/1987"));
        name.setAge(36);
    }

    public static ApiBooking montaBookingHotel(ApiHotelAvail hotelAvail) {
        ApiBooking booking = new ApiBooking();
        if (hotelAvail != null) {
            //pega primeiro quarto da listagem 
            ApiRoom apiRoom = hotelAvail.getRoomGroups().get(0).getRooms().get(0);
            ApiBookingHotel bookingHotel = new ApiBookingHotel(new ApiHotel(hotelAvail.getHotel().getId()), Arrays.asList(new ApiRoom(apiRoom.getKey(), apiRoom.getNames())));
            booking.setBookingHotels(Arrays.asList(bookingHotel));
        }
        return booking;
    }
}
