package br.com.infotravel.api.commonv1.dto.ticket;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTicketModalitie {

    private String code;
    private String name;
    private String description;
    private Integer days;
    private ApiTicketDate date;
    private List<ApiTicketDate> dates;
    private List<ApiFare> fares;

    public ApiTicketModalitie() {
    }

    public ApiTicketModalitie(String code, String name, ApiTicketDate date) {
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public ApiTicketModalitie(String code, String name, String description, Integer days, List<ApiFare> fares) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.days = days;
        this.fares = fares;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public ApiTicketDate getDate() {
        return date;
    }

    public void setDate(ApiTicketDate date) {
        this.date = date;
    }

    public List<ApiTicketDate> getDates() {
        return dates;
    }

    public void setDates(List<ApiTicketDate> dates) {
        this.dates = dates;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }
}
