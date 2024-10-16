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
import br.com.infotravel.api.commonv1.dto.tour.ApiBookingTour;
import br.com.infotravel.api.commonv1.dto.tour.ApiTour;
import br.com.infotravel.api.commonv1.dto.tour.ApiTourAvail;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import br.com.infotravel.api.commonv1.requests.ActivityAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.TourAvailbilityRS;
import br.com.infotravel.api.commonv1.utils.Utils;

import java.util.Arrays;
import java.util.List;


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
        AuthenticationRQ authenticationRQ = new AuthenticationRQ("parceirows", "parceiro123", "2", "DEVELOP", "pt_br");

        ApiToken token = infotravelClient.authenticate(authenticationRQ);
        System.out.println("Token obtido: " + token.getAccessToken());

        ActivityAvailabilityRQ availabilityRQ = new ActivityAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2802");
        TourAvailbilityRS availbilityRS = infotravelClient.tourAvail(availabilityRQ, token);

        if (availbilityRS != null && !availbilityRS.getTourAvailList().isEmpty()) {

            ApiBooking requestCheckRate = montaCheckRate(availbilityRS.getTourAvailList().get(0));
            ApiBooking responseCheckRate = chamaCheckRate(requestCheckRate, token);

            if (responseCheckRate.getBookingTours() != null && !responseCheckRate.getBookingTours().isEmpty()) {
                ApiBooking requestBooking = montaBooking(responseCheckRate);
                ApiBooking responseBooking = chamaBooking(requestBooking, token);
                System.out.println("BOOKING CREATE '" + responseBooking.getId() + "' STATUS '" + responseBooking.getStatus().name() + "' ");
            }

        }

    }


    public static ApiBooking chamaCheckRate(ApiBooking booking, ApiToken token) throws ApiException {
        BookingRS rs = infotravelClient.checkRate(new BookingRQ(booking), token);
        return rs.getBooking();
    }

    public static ApiBooking chamaBooking(ApiBooking booking, ApiToken token) throws ApiException {
        BookingRS rs = infotravelClient.booking(new BookingRQ(booking), token);

        return rs.getBooking();
    }

    public static List<ApiName> montaNomes(List<ApiName> names) {
        ApiName name = names.get(0);
        name.setFirstName("SILVA");
        name.setLastName("Gomes");
        name.setBirth(Utils.toDate("1987-12-01", "yyyy-MM-dd"));
        name.setAge(36);

        name = names.get(1);
        name.setFirstName("MARIA");
        name.setLastName("Gomes");
        name.setBirth(Utils.toDate("1987-12-01", "yyyy-MM-dd"));
        name.setAge(36);
        return names;
    }

    public static ApiBooking montaCheckRate(ApiTourAvail tourAvail) {
        ApiBooking booking = new ApiBooking();
        if (tourAvail != null) {
            ApiBookingTour apiBookingTour = new ApiBookingTour(new ApiTour(tourAvail.getTour().getKey()), tourAvail.getDates().get(0), tourAvail.getNames());
            booking.setBookingTours(List.of(apiBookingTour));
        }
        return booking;
    }


    public static ApiBooking montaBooking(ApiBooking bookingCheckRate) {
        ApiBooking booking = new ApiBooking();
        booking.setContact(new ApiContact("Joao Teste", "teste@infotera.com.br", "213213123213"));

        if (!bookingCheckRate.getBookingTours().isEmpty()) {

            ApiBookingTour bookingTourCheckRate = bookingCheckRate.getBookingTours().get(0);

            booking.setId(bookingCheckRate.getId());

            ApiBookingTour bookingTour = new ApiBookingTour(new ApiTour(bookingTourCheckRate.getTour().getKey()), bookingTourCheckRate.getTour().getDate(), montaNomes(bookingTourCheckRate.getNames()));

            booking.setBookingTours(List.of(bookingTour));
        }

        return booking;
    }


}
