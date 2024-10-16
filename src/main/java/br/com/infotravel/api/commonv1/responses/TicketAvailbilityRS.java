package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ticket.ApiTicketAvail;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketAvailbilityRS {

    @JsonProperty("ticketAvail")
    private List<ApiTicketAvail> ticketAvails;
    private String message;

    public TicketAvailbilityRS() {
    }

    public List<ApiTicketAvail> getTicketAvails() {
        return ticketAvails;
    }

    public void setTicketAvails(List<ApiTicketAvail> ticketAvails) {
        this.ticketAvails = ticketAvails;
    }

    public TicketAvailbilityRS(List<ApiTicketAvail> ticketAvails) {
        this.ticketAvails = ticketAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
