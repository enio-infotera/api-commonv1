package br.com.infotravel.api.commonv1.dto.ticket;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTicketAvail {

    private ApiTicket ticket;
    @JsonSerialize(contentUsing = CustomDateSerializer.class)
    private List<Date> dates;
    private List<ApiFare> fares;
    private List<ApiTicketModalitie> modalities;

    private List<ApiName> names;

    public ApiTicketAvail() {
    }

    public ApiTicketAvail(ApiTicket ticket, List<Date> dates, List<ApiFare> fares, List<ApiTicketModalitie> modalities, List<ApiName> names) {
        this.ticket = ticket;
        this.dates = dates;
        this.fares = fares;
        this.modalities = modalities;
        this.names = names;
    }

    public ApiTicket getTicket() {
        return ticket;
    }

    public void setTicket(ApiTicket ticket) {
        this.ticket = ticket;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiTicketModalitie> getModalities() {
        return modalities;
    }

    public void setModalities(List<ApiTicketModalitie> modalities) {
        this.modalities = modalities;
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
