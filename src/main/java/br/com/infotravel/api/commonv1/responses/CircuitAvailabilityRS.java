package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.circuit.ApiCircuitAvail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CircuitAvailabilityRS {

    @JsonProperty("circuitAvail")
    private List<ApiCircuitAvail> apiCircuitAvailList;
    private String message;

    public CircuitAvailabilityRS() {
    }

    public CircuitAvailabilityRS(List<ApiCircuitAvail> apiCircuitAvailList) {
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
