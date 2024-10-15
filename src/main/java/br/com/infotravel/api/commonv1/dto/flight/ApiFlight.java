package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiFlight {

    private String key;

    private String code;
    private ApiAirline airline;
    private ApiAirport origin;
    private ApiAirport destination;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date departure;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date arrival;
    private String number;
    private String duration;

    private Integer stopsCount;

    private Boolean available;
    private Integer quantity;

    private List<ApiSegment> segments;
    private List<ApiFare> fares;

    private List<ApiFareFlight> optionalFares;

    private ApiFareFlight optionalFare;

    public ApiFlight() {
    }

    public ApiFlight(String key) {
        this.key = key;
    }

    public ApiFlight(String key, String code, ApiAirline airline, ApiAirport origin, ApiAirport destination, Date departure, Date arrival, String number, String duration, Integer stopsCount, Boolean available, List<ApiSegment> segments, List<ApiFare> fares) {
        this.key = key;
        this.code = code;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.number = number;
        this.duration = duration;
        this.stopsCount = stopsCount;
        this.available = available;
        this.segments = segments;
        this.fares = fares;
    }

    public ApiAirline getAirline() {
        return airline;
    }

    public void setAirline(ApiAirline airline) {
        this.airline = airline;
    }

    public ApiAirport getOrigin() {
        return origin;
    }

    public void setOrigin(ApiAirport origin) {
        this.origin = origin;
    }

    public ApiAirport getDestination() {
        return destination;
    }

    public void setDestination(ApiAirport destination) {
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ApiSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<ApiSegment> segments) {
        this.segments = segments;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }


    public List<ApiFareFlight> getOptionalFares() {
        return optionalFares;
    }

    public void setOptionalFares(List<ApiFareFlight> optionalFares) {
        this.optionalFares = optionalFares;
    }

    public ApiFareFlight getOptionalFare() {
        return optionalFare;
    }

    public void setOptionalFare(ApiFareFlight optionalFare) {
        this.optionalFare = optionalFare;
    }
}
