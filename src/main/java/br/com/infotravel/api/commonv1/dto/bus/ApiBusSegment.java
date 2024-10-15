/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.bus;

import br.com.infotravel.api.commonv1.dto.ApiSeat;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBusSegment {

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date startDate;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
    private ApiBusStation origin;
    private ApiBusStation destination;
    private String number;
    private String hoursInAdvance;
    private ApiBusCompany company;
    private String boarding;
    private List<ApiSeat> seatMap;
    private List<ApiSeat> seats;

    public ApiBusSegment() {
    }

    public ApiBusSegment(Date startDate, Date endDate, ApiBusStation origin, ApiBusStation destination, String number, String hoursInAdvance, ApiBusCompany company, String boarding) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.origin = origin;
        this.destination = destination;
        this.number = number;
        this.hoursInAdvance = hoursInAdvance;
        this.company = company;
        this.boarding = boarding;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ApiBusStation getOrigin() {
        return origin;
    }

    public void setOrigin(ApiBusStation origin) {
        this.origin = origin;
    }

    public ApiBusStation getDestination() {
        return destination;
    }

    public void setDestination(ApiBusStation destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHoursInAdvance() {
        return hoursInAdvance;
    }

    public void setHoursInAdvance(String hoursInAdvance) {
        this.hoursInAdvance = hoursInAdvance;
    }

    public ApiBusCompany getCompany() {
        return company;
    }

    public void setCompany(ApiBusCompany company) {
        this.company = company;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public List<ApiSeat> getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(List<ApiSeat> seatMap) {
        this.seatMap = seatMap;
    }

    public List<ApiSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<ApiSeat> seats) {
        this.seats = seats;
    }

}
