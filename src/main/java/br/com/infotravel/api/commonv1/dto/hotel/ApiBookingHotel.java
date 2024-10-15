/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import java.util.List;


/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingHotel {

    private BookingStatus status;
    private List<ApiLocator> locators;
    private String provider;
    private ApiHotel hotel;
    
    private List<ApiRoom> rooms;

    private List<ApiContact> contacts;

    private Boolean rebooking;

    private String textDoc;

    public ApiBookingHotel() {
    }

    public ApiBookingHotel(ApiHotel hotel, List<ApiRoom> rooms) {
        this.hotel = hotel;
        this.rooms = rooms;
    }

    public ApiBookingHotel(List<ApiLocator> locators, ApiHotel hotel, List<ApiRoom> rooms, String provider, BookingStatus status) {
        this.locators = locators;
        this.hotel = hotel;
        this.rooms = rooms;
        this.provider = provider;
        this.status = status;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public List<ApiLocator> getLocators() {
        return locators;
    }

    public void setLocators(List<ApiLocator> locators) {
        this.locators = locators;
    }

    public ApiHotel getHotel() {
        return hotel;
    }

    public void setHotel(ApiHotel hotel) {
        this.hotel = hotel;
    }

    public List<ApiRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ApiRoom> rooms) {
        this.rooms = rooms;
    }

    public List<ApiContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ApiContact> contacts) {
        this.contacts = contacts;
    }

    public Boolean getRebooking() {
        return rebooking;
    }

    public void setRebooking(Boolean rebooking) {
        this.rebooking = rebooking;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }
}
