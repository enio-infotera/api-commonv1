package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuitAvail;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CircuitAvailbilityRS {

    @JsonProperty("circuitAvail")
    private List<ApiCircuitAvail> apiCircuitAvailList;
    private String message;


    public CircuitAvailbilityRS(List<ApiCircuitAvail> apiCircuitAvailList) {
        this.apiCircuitAvailList = apiCircuitAvailList;
    }

    public List<ApiCircuitAvail> getApiCircuitAvailList() {
        return apiCircuitAvailList;
    }

    public void setApiCircuitAvailList(List<ApiCircuitAvail> apiCircuitAvailList) {
        this.apiCircuitAvailList = apiCircuitAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
