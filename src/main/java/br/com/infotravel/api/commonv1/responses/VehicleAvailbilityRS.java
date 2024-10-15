package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.vehicle.ApiVehicleAvail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleAvailbilityRS {

    @JsonProperty("vehicleAvails")
    private List<ApiVehicleAvail> vehicleAvails;
    private String message;

    public VehicleAvailbilityRS() {
    }

    public VehicleAvailbilityRS(List<ApiVehicleAvail> vehicleAvails, String message) {
        this.vehicleAvails = vehicleAvails;
        this.message = message;
    }

    public List<ApiVehicleAvail> getVehicleAvails() {
        return vehicleAvails;
    }

    public void setVehicleAvails(List<ApiVehicleAvail> vehicleAvails) {
        this.vehicleAvails = vehicleAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
