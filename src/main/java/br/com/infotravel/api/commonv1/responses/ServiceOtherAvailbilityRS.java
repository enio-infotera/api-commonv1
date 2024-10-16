/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.serviceother.ApiServiceOtherAvail;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceOtherAvailbilityRS {

    @SerializedName("serviceOtherAvail")
    private List<ApiServiceOtherAvail> serviceOtherAvails;
    private String message;

    public ServiceOtherAvailbilityRS() {
    }

    public ServiceOtherAvailbilityRS(List<ApiServiceOtherAvail> serviceOtherAvails) {
        this.serviceOtherAvails = serviceOtherAvails;
    }

    public List<ApiServiceOtherAvail> getServiceOtherAvails() {
        return serviceOtherAvails;
    }

    public void setServiceOtherAvails(List<ApiServiceOtherAvail> serviceOtherAvails) {
        this.serviceOtherAvails = serviceOtherAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
