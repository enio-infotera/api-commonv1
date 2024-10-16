package br.com.infotravel.api.commonv1.client;

import br.com.infotravel.api.commonv1.dto.ApiBooking;
import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import br.com.infotravel.api.commonv1.requests.ActivityAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.TicketAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import br.com.infotravel.api.commonv1.responses.TicketAvailbilityRS;
import br.com.infotravel.api.commonv1.responses.TourAvailbilityRS;

/**
 * @author enioj
 */
public class InfotravelClient {

    private final InfotravelHttpClient httpClientService;
    private final String baseUrl;

    public InfotravelClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.httpClientService = new InfotravelHttpClient();
    }

    public ApiToken authenticate(AuthenticationRQ authenticationRQ) throws ApiException {
        String url = baseUrl + "/authenticate";
        return httpClientService.sendRequest(url, authenticationRQ, ApiToken.class, "POST", null);
    }

    public HotelAvailbilityRS hotelAvailability(HotelAvailabilityRQ request, ApiToken token) throws ApiException {
        String url = httpClientService.buildUri(baseUrl + "/avail/hotel", request.getUrlParams());
        return httpClientService.sendRequest(url, request, HotelAvailbilityRS.class, "GET", token);
    }

    public TourAvailbilityRS tourAvail(ActivityAvailabilityRQ request, ApiToken token) throws ApiException {
        String url = httpClientService.buildUri(baseUrl + "/avail/activity", request.getUrlParams());
        return httpClientService.sendRequest(url, request, TourAvailbilityRS.class, "GET", token);
    }

    public TicketAvailbilityRS ticketAvail(TicketAvailabilityRQ request, ApiToken token) throws ApiException {
        String url = httpClientService.buildUri(baseUrl + "/avail/ticket", request.getUrlParams());
        return httpClientService.sendRequest(url, request, TicketAvailbilityRS.class, "GET", token);
    }

    public BookingRS checkRate(BookingRQ request, ApiToken token) throws ApiException {
        String url = baseUrl + "/checkRate";
        return httpClientService.sendRequest(url, request, BookingRS.class, "POST", token);
    }

    public BookingRS booking(BookingRQ request, ApiToken token) throws ApiException {
        String url = baseUrl + "/booking";
        return httpClientService.sendRequest(url, request, BookingRS.class, "POST", token);
    }

    public ApiBooking findBooking(Integer bookingId, ApiToken token) throws ApiException {
        String url = baseUrl + "/booking/" + bookingId;
        return httpClientService.sendRequest(url, null, ApiBooking.class, "GET", token);
    }
}
