/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import java.util.Date;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiHotelAvail {

    private String provider;
     @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkIn;
     @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkOut;

    private ApiHotel hotel;

    private ApiLowestFare lowestFare;
    private List<ApiRoomGroup> roomGroups;

    public ApiHotelAvail() {
    }

    public ApiHotelAvail(ApiHotel hotel, String provider) {
        this.hotel = hotel;
        this.provider = provider;
    }

    public ApiHotelAvail(ApiHotel hotel, List<ApiRoomGroup> roomGroups) {
        this.hotel = hotel;
        this.roomGroups = roomGroups;
    }

    public ApiHotel getHotel() {
        return hotel;
    }

    public void setHotel(ApiHotel hotel) {
        this.hotel = hotel;
    }

    public List<ApiRoomGroup> getRoomGroups() {
        return roomGroups;
    }

    public void setRoomGroups(List<ApiRoomGroup> roomGroups) {
        this.roomGroups = roomGroups;
    }

    public ApiLowestFare getLowestFare() {
        return lowestFare;
    }

    public void setLowestFare(ApiLowestFare lowestFare) {
        this.lowestFare = lowestFare;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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
