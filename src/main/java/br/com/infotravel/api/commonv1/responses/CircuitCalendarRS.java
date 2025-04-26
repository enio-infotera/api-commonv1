package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.circuit.ApiBookingCircuit;

/**
 *
 * @author enioj
 */
public class CircuitCalendarRS {

    private ApiBookingCircuit bookingCircuit;

    public CircuitCalendarRS() {
    }

    public ApiBookingCircuit getBookingCircuit() {
        return bookingCircuit;
    }

    public void setBookingCircuit(ApiBookingCircuit bookingCircuit) {
        this.bookingCircuit = bookingCircuit;
    }

}
