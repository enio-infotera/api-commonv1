package br.com.infotravel.api.commonv1.dto.servicepackage;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiServicePackageAvail {

    private ApiServicePackage servicePackage;
    @JsonSerialize(contentUsing = CustomDateSerializer.class)
    private List<Date> dates;
    private List<ApiFare> fares;

    private List<ApiName> names;

    public ApiServicePackageAvail() {
    }

    public ApiServicePackageAvail(ApiServicePackage servicePackage, List<Date> dates, List<ApiFare> fares, List<ApiName> names) {
        this.servicePackage = servicePackage;
        this.dates = dates;
        this.fares = fares;
        this.names = names;
    }

    public ApiServicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(ApiServicePackage servicePackage) {
        this.servicePackage = servicePackage;
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
