package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.enumerators.FlightClassType;
import br.com.infotravel.api.commonv1.enumerators.FlightType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSegment {

    private ApiAirline airline;
    private ApiAirline operation;
    private ApiAirport origin;
    private ApiAirport destination;
    private String number;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date departure;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date arrival;
    private String classCode;
    private FlightType flightType;
    @JsonProperty("class")
    private FlightClassType flightClass;
    private ApiBaggage baggage;
    private String duration;

    private String aircraft;

    public ApiSegment() {
    }

    public ApiSegment(ApiAirport origin, ApiAirport destination, String number, Date departure, Date arrival, String classCode, FlightClassType flightClass, String aircraft, FlightType flightType) {
        this.origin = origin;
        this.destination = destination;
        this.number = number;
        this.departure = departure;
        this.arrival = arrival;
        this.classCode = classCode;
        this.flightClass = flightClass;
        this.flightType = flightType;
        this.aircraft = aircraft;
    }

    public ApiAirline getAirline() {
        return airline;
    }

    public void setAirline(ApiAirline airline) {
        this.airline = airline;
    }

    public ApiAirline getOperation() {
        return operation;
    }

    public void setOperation(ApiAirline operation) {
        this.operation = operation;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public FlightClassType getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(FlightClassType flightClass) {
        this.flightClass = flightClass;
    }

    public ApiBaggage getBaggage() {
        return baggage;
    }

    public void setBaggage(ApiBaggage baggage) {
        this.baggage = baggage;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }


    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
