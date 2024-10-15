/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.hotel.ApiHotel;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDetailRS {

    private ApiHotel hotel;

    public HotelDetailRS() {
    }

    public HotelDetailRS(ApiHotel hotel) {
        this.hotel = hotel;
    }

    public ApiHotel getHotel() {
        return hotel;
    }

    public void setHotel(ApiHotel hotel) {
        this.hotel = hotel;
    }

}
