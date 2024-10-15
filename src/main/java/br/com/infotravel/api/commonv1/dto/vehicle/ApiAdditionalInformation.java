/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAdditionalInformation implements Serializable {

    private ApiPaidOnDestination paidOnDestination;
    private ApiWarning warning;

    public ApiAdditionalInformation() {
    }

    public ApiPaidOnDestination getPaidOnDestination() {
        return paidOnDestination;
    }

    public void setPaidOnDestination(ApiPaidOnDestination paidOnDestination) {
        this.paidOnDestination = paidOnDestination;
    }

    public ApiWarning getWarning() {
        return warning;
    }

    public void setWarning(ApiWarning warning) {
        this.warning = warning;
    }

}
