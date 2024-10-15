package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.BookingStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBackOfficeBooking {

    private Integer id;
    private BookingStatus status;

    public ApiBackOfficeBooking() {
    }

    public ApiBackOfficeBooking(Integer id) {
        this.id = id;
    }

    public ApiBackOfficeBooking(Integer id, BookingStatus status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

}
