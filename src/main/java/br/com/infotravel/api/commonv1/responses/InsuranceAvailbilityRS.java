/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.insurance.ApiInsuranceAvail;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuranceAvailbilityRS {

    @JsonProperty("insuranceAvail")
    private List<ApiInsuranceAvail> apiInsuranceAvailList;
    private String message;

    public InsuranceAvailbilityRS() {
    }

    public InsuranceAvailbilityRS(List<ApiInsuranceAvail> apiInsuranceAvailList) {
        this.apiInsuranceAvailList = apiInsuranceAvailList;
    }

    public List<ApiInsuranceAvail> getApiInsuranceAvailList() {
        return apiInsuranceAvailList;
    }

    public void setApiInsuranceAvailList(List<ApiInsuranceAvail> apiInsuranceAvailList) {
        this.apiInsuranceAvailList = apiInsuranceAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
