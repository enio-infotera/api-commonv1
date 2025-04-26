package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.circuit.ApiBookingCircuit;

/**
 *
 * @author enioj
 */
public class CircuitDailyDetailRS {

    private ApiBookingCircuit bookingCircuit;

    public CircuitDailyDetailRS() {
    }

    public ApiBookingCircuit getBookingCircuit() {
        return bookingCircuit;
    }

    public void setBookingCircuit(ApiBookingCircuit bookingCircuit) {
        this.bookingCircuit = bookingCircuit;
    }

}
