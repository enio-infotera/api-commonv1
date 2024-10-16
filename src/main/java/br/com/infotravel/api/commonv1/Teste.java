/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.dto.hotel.ApiBookingHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotel;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotelAvail;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoom;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import java.io.IOException;
import java.util.Arrays;

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

    public static void testeHotel(ApiToken token) throws Exception {
        //monta request
        HotelAvailabilityRQ availabilityDestinationRQ = new HotelAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2705", null);
        HotelAvailbilityRS hotelAvailbilityRS = httpClientService.hotelAvailability(availabilityDestinationRQ, token.getAccessToken());
        if (hotelAvailbilityRS != null && hotelAvailbilityRS.getApiHotelAvailList() != null && !hotelAvailbilityRS.getApiHotelAvailList().isEmpty()) {
            for (ApiHotelAvail avail : hotelAvailbilityRS.getApiHotelAvailList()) {
                System.out.println("Hotel " + avail.getHotel().getName() + " " + avail.getProvider());
            }
            ApiBooking booking = montaBookingHotel(hotelAvailbilityRS.getApiHotelAvailList().get(0));
            chamaCheckRates(booking);
            chamaBooking(booking);
        }
    }

    public static ApiToken chamaAuthentication() throws Exception {
        AuthenticationRQ authenticationRQ = new AuthenticationRQ("123", "123", "2", "DEVELOP", "pt_br");
        ApiToken token = httpClientService.authenticate(authenticationRQ);
        return token;
    }

    public static void chamaCheckRates(ApiBooking booking) {
        BookingRS rs = httpClientService.authenticate(new );
        return token;
    }

    public static void chamaBooking(ApiBooking booking) {

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
//{
//    "booking": {
//        "id": 132,
//        "contact": {
//            "name": "John Doe",
//            "email": "johndoe@test.com",
//            "telephone": "5511999999999"
//        },
//        "bookingHotels": [
//            {
//                "hotel": {
//                    "id": 207684
//                },
//                "rooms": [
//                    {
//                        "key": "COEKKCCCZ%FZBC1ZZZ",
//                        "names": [
//                            {
