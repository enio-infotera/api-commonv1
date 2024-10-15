/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.transfer;

import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.enumerators.TransferInOut;
import br.com.infotravel.api.commonv1.enumerators.TransferType;
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
public class ApiTransfer {

    private String provider;
    private String key;
    private String name;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date date;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
    private String description;
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
    private ApiImage image;
    private Boolean unique;

    private Boolean onRequest;

    private String code;
    private List<ApiTransferSegment> segments;

    private String duration;
    private String observation;
    private String touristGuide;
    private String frequency;
    private List<String> included;
    private List<String> notIncluded;

    public ApiTransfer() {
    }

    public ApiTransfer(String key) {
        this.key = key;
    }

    public ApiTransfer(String key, String name, Date date, Date end, String description, String arrivalPlace, Date transportDate, String transportNumber, String transportName, String origin, String destination, TransferType type, ApiVehicleTransfer vehicle, TransferInOut transportType, String code, Boolean unique, ApiImage image, Boolean onRequest, List<ApiTransferSegment> segments, String provider) {
        this.key = key;
        this.name = name;
        this.date = date;
        this.endDate = end;
        this.description = description;
        this.arrivalPlace = arrivalPlace;
        this.transportDate = transportDate;
        this.transportNumber = transportNumber;
        this.transportName = transportName;
        this.origin = origin;
        this.destination = destination;
        this.type = type;
        this.vehicle = vehicle;
        this.transportType = transportType;
        this.unique = unique;
        this.image = image;
        this.onRequest = onRequest;
        this.code = code;
        this.segments = segments;
        this.provider = provider;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }

    public List<ApiTransferSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<ApiTransferSegment> segments) {
        this.segments = segments;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getOnRequest() {
        return onRequest;
    }

    public void setOnRequest(Boolean onRequest) {
        this.onRequest = onRequest;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTouristGuide() {
        return touristGuide;
    }

    public void setTouristGuide(String touristGuide) {
        this.touristGuide = touristGuide;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<String> getIncluded() {
        return included;
    }

    public void setIncluded(List<String> included) {
        this.included = included;
    }

    public List<String> getNotIncluded() {
        return notIncluded;
    }

    public void setNotIncluded(List<String> notIncluded) {
        this.notIncluded = notIncluded;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

}
