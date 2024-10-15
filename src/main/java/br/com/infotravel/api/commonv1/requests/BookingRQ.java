/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.requests;

import br.com.infotravel.api.commonv1.dto.ApiBooking;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingRQ {

    private ApiBooking booking;

    public BookingRQ() {
    }

    public BookingRQ(ApiBooking booking) {
        this.booking = booking;
    }

    public ApiBooking getBooking() {
        return booking;
    }

    public void setBooking(ApiBooking booking) {
        this.booking = booking;
    }

}
