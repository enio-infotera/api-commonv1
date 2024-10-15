package br.com.infotravel.api.commonv1.dto.ticket;

import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTicketDate {

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date start;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date end;
    private String description;
    private Double price;

    public ApiTicketDate() {
    }

    public ApiTicketDate(Date start, Date end, String description, Double price) {
        this.start = start;
        this.end = end;
        this.description = description;
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
