package br.com.infotravel.api.commonv1.dto.tour;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTourAvail {

    private ApiTour tour;
    @JsonSerialize(contentUsing = CustomDateNoHourSerializer.class)
    @JsonDeserialize(contentUsing = CustomDateNoHourDeserializer.class)
    private List<Date> dates;
    private List<ApiFare> fares;

    private List<ApiName> names;

    public ApiTourAvail() {
    }

    public ApiTourAvail(ApiTour tour, List<Date> dates, List<ApiFare> fares, List<ApiName> names) {
        this.tour = tour;
        this.dates = dates;
        this.fares = fares;
        this.names = names;
    }

    public ApiTour getTour() {
        return tour;
    }

    public void setTour(ApiTour tour) {
        this.tour = tour;
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
