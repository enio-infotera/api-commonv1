package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.flight.ApiFlightAvail;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightAvailbilityRS {

    @SerializedName("flightAvail")
    private List<ApiFlightAvail> apiFlightAvails;
    private String message;

    public FlightAvailbilityRS() {
    }

    public FlightAvailbilityRS(List<ApiFlightAvail> apiFlightAvails) {
        this.apiFlightAvails = apiFlightAvails;
    }

    public List<ApiFlightAvail> getApiFlightAvails() {
        return apiFlightAvails;
    }

    public void setApiFlightAvails(List<ApiFlightAvail> apiFlightAvails) {
        this.apiFlightAvails = apiFlightAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
