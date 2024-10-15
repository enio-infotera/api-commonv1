/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.bus;

import br.com.infotravel.api.commonv1.dto.ApiFare;
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
public class ApiBus {

    private String key;

    private Integer code;
    private ApiBusCompany company;

    private ApiBusStation origin;
    private ApiBusStation destination;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date departure;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date arrival;
    private String number;
    private String duration;

    private String boarding;
    private Integer stopsCount;

    private Boolean available;
    private Integer quantity;

    private List<ApiBusSegment> segments;
    private List<ApiFare> fares;

    public ApiBus() {
    }

    public ApiBus(String key) {
        this.key = key;
    }

    public ApiBus(String key, Integer code, ApiBusCompany company, ApiBusStation origin, ApiBusStation destination, Date departure, Date arrival, String number, String duration, String boarding, Integer stopsCount, Boolean available, List<ApiBusSegment> segments, List<ApiFare> fares) {
        this.key = key;
        this.code = code;
        this.company = company;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.number = number;
        this.duration = duration;
        this.boarding = boarding;
        this.stopsCount = stopsCount;
        this.available = available;
        this.segments = segments;
        this.fares = fares;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ApiBusCompany getCompany() {
        return company;
    }

    public void setCompany(ApiBusCompany company) {
        this.company = company;
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

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getStopsCount() {
        return stopsCount;
    }

    public void setStopsCount(Integer stopsCount) {
        this.stopsCount = stopsCount;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<ApiBusSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<ApiBusSegment> segments) {
        this.segments = segments;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

}
