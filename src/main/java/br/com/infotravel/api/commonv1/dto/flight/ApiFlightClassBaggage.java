package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.enumerators.FlightClassType;

public class ApiFlightClassBaggage {

    private String number;
    private FlightClassType flightClassType;
    private ApiBaggage baggage;
    private String code;

    public ApiFlightClassBaggage() {
    }

    public ApiFlightClassBaggage(String number, FlightClassType flightClassType, ApiBaggage baggage, String code) {
        this.number = number;
        this.flightClassType = flightClassType;
        this.baggage = baggage;
        this.code = code;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public FlightClassType getFlightClassType() {
        return flightClassType;
    }

    public void setFlightClassType(FlightClassType flightClassType) {
        this.flightClassType = flightClassType;
    }

    public ApiBaggage getBaggage() {
        return baggage;
    }

    public void setBaggage(ApiBaggage baggage) {
        this.baggage = baggage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
