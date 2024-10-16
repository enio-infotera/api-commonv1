package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.requests.ActivityAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import br.com.infotravel.api.commonv1.responses.TourAvailbilityRS;

import java.io.IOException;

/**
 *
 */
public class TestServico {


    public static void main(String[] args) {
        String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
        HttpClientService httpClientService = new HttpClientService(baseUrl);

        try {

            AuthenticationRQ authenticationRQ = new AuthenticationRQ("parceirows", "parceiro123", "2", "DEVELOP", "pt_br");

            ApiToken token = httpClientService.authenticate(authenticationRQ);
            System.out.println("Token obtido: " + token.getAccessToken());

            ActivityAvailabilityRQ availabilityRQ = new ActivityAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2802");
            TourAvailbilityRS availbilityRS = httpClientService.tourAvail(availabilityRQ, token.getAccessToken());

            System.out.println(availbilityRS);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void checkRate(){
        String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
        HttpClientService httpClientService = new HttpClientService(baseUrl);

        try {

            AuthenticationRQ authenticationRQ = new AuthenticationRQ("123", "123", "2", "DEVELOP", "pt_br");

            ApiToken token = httpClientService.authenticate(authenticationRQ);
            System.out.println("Token obtido: " + token.getAccessToken());

            BookingRQ rq = new BookingRQ();
            BookingRS bookingRS = httpClientService.checkRates(rq, token.getAccessToken());

            System.out.println(bookingRS);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }









}
