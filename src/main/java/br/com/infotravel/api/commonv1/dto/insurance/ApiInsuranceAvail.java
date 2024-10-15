/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.insurance;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiInsuranceAvail {

    private ApiInsurance insurance;
    @JsonSerialize(contentUsing = CustomDateSerializer.class)
    private List<Date> dates;
    private List<ApiFare> fares;

    private List<ApiName> names;

    public ApiInsuranceAvail() {
    }

    public ApiInsuranceAvail(ApiInsurance insurance, List<Date> dates, List<ApiFare> fares, List<ApiName> names) {
        this.insurance = insurance;
        this.dates = dates;
        this.fares = fares;
        this.names = names;
    }

    public ApiInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(ApiInsurance insurance) {
        this.insurance = insurance;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

}
