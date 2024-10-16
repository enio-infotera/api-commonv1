package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.client.InfotravelClient;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.requests.ActivityAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.TourAvailbilityRS;


/**
 *
 */
public class TestServico {

    private static final String username = "username";
    private static final String password = "password";
    private static final String client = "CLIENT_SG";
    private static final String agency = "2";
    private static final String language = "pt_br";

    private static final String baseUrl = "http://develop.dev-infotravel.com.br/infotravel/api/v1";
    private static InfotravelClient infotravelClient = new InfotravelClient(baseUrl);

    public static void main(String[] args) {
//        try {

        AuthenticationRQ authenticationRQ = new AuthenticationRQ("parceirows", "parceiro123", "2", "DEVELOP", "pt_br");

        ApiToken token = infotravelClient.authenticate(authenticationRQ);
        System.out.println("Token obtido: " + token.getAccessToken());

        ActivityAvailabilityRQ availabilityRQ = new ActivityAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2802");
        TourAvailbilityRS availbilityRS = infotravelClient.tourAvail(availabilityRQ, token);

        System.out.println(availbilityRS);

//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static void checkRate() {

//        try {
        AuthenticationRQ authenticationRQ = new AuthenticationRQ("123", "123", "2", "DEVELOP", "pt_br");

        ApiToken token = infotravelClient.authenticate(authenticationRQ);
        System.out.println("Token obtido: " + token.getAccessToken());

        BookingRQ rq = new BookingRQ();
        BookingRS bookingRS = infotravelClient.checkRate(rq, token);

        System.out.println(bookingRS);

//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
