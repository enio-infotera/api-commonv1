/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import br.com.infotravel.api.commonv1.dto.ApiBoardType;
import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiFare;

import java.util.Date;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiLowestFare {

    private ApiRoomType roomType;
    private List<ApiRoomType> roomTypes;
    private List<ApiFare> fares;
    private List<ApiBoardType> boardTypes;
    private ApiCancellationPolicy cancellationPolicies;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkIn;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkOut;

    public ApiLowestFare() {
    }

    public ApiLowestFare(ApiRoomType roomType, List<ApiRoomType> roomTypes, List<ApiFare> fares, List<ApiBoardType> boardTypes, ApiCancellationPolicy cancellationPolicies, Date checkIn, Date checkOut) {
        this.roomType = roomType;
        this.roomTypes = roomTypes;
        this.fares = fares;
        this.boardTypes = boardTypes;
        this.cancellationPolicies = cancellationPolicies;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public ApiRoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(ApiRoomType roomType) {
        this.roomType = roomType;
    }

    public List<ApiRoomType> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<ApiRoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiBoardType> getBoardTypes() {
        return boardTypes;
    }

    public void setBoardTypes(List<ApiBoardType> boardTypes) {
        this.boardTypes = boardTypes;
    }

    public ApiCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(ApiCancellationPolicy cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

}
