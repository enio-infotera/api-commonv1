/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.transfer;

import br.com.infotravel.api.commonv1.enumerators.TransferInOut;
import br.com.infotravel.api.commonv1.enumerators.TransferType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTransferSegment {

    private String arrivalPlace;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date transportDate;
    private String transportNumber;
    private String transportName;
    private String origin;
    private String destination;
    private TransferType type;
    private ApiVehicleTransfer vehicle;
    private TransferInOut transportType;

    private String startTime;
    private String endTime;

    public ApiTransferSegment() {
    }

    public ApiTransferSegment(String arrivalPlace, Date transportDate, String transportNumber, String transportName, String origin, String destination, TransferType type, ApiVehicleTransfer vehicle, TransferInOut transportType) {
        this.arrivalPlace = arrivalPlace;
        this.transportDate = transportDate;
        this.transportNumber = transportNumber;
        this.transportName = transportName;
        this.origin = origin;
        this.destination = destination;
        this.type = type;
        this.vehicle = vehicle;
        this.transportType = transportType;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public Date getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(Date transportDate) {
        this.transportDate = transportDate;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType type) {
        this.type = type;
    }

    public ApiVehicleTransfer getVehicle() {
        return vehicle;
    }

    public void setVehicle(ApiVehicleTransfer vehicle) {
        this.vehicle = vehicle;
    }

    public TransferInOut getTransportType() {
        return transportType;
    }

    public void setTransportType(TransferInOut transportType) {
        this.transportType = transportType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
