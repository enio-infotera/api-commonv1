/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.hotel.ApiHotelAvail;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelAvailbilityRS {

    @JsonProperty("hotelAvail")
    private List<ApiHotelAvail> apiHotelAvailList;
    private String message;

    public HotelAvailbilityRS() {
    }

    public HotelAvailbilityRS(List<ApiHotelAvail> apiHotelAvailList) {
        this.apiHotelAvailList = apiHotelAvailList;
    }

    public List<ApiHotelAvail> getApiHotelAvailList() {
        return apiHotelAvailList;
    }

    public void setApiHotelAvailList(List<ApiHotelAvail> apiHotelAvailList) {
        this.apiHotelAvailList = apiHotelAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
