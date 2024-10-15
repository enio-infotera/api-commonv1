package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ApiBooking;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OnRequestRS {

    private ApiBooking booking;

    public ApiBooking getBooking() {
        return booking;
    }

    public void setBooking(ApiBooking booking) {
        this.booking = booking;
    }
}
