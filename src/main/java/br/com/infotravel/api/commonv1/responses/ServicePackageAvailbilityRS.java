package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.servicepackage.ApiServicePackageAvail;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServicePackageAvailbilityRS {

    @JsonProperty("servicePackageAvail")
    private List<ApiServicePackageAvail> servicePackageAvails;
    private String message;

    public ServicePackageAvailbilityRS() {
    }

    public ServicePackageAvailbilityRS(List<ApiServicePackageAvail> servicePackageAvails) {
        this.servicePackageAvails = servicePackageAvails;
    }

    public List<ApiServicePackageAvail> getServicePackageAvails() {
        return servicePackageAvails;
    }

    public void setServicePackageAvails(List<ApiServicePackageAvail> servicePackageAvails) {
        this.servicePackageAvails = servicePackageAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
