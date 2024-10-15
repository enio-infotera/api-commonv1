/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.bus;

import br.com.infotravel.api.commonv1.dto.ApiCity;
import br.com.infotravel.api.commonv1.dto.ApiCoordinates;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBusStation {

    private String name;
    private String code;
    private ApiCoordinates coordinate;
    private ApiCity city;

    public ApiBusStation() {
    }

    public ApiBusStation(String name, String code, ApiCoordinates coordinate, ApiCity city) {
        this.name = name;
        this.code = code;
        this.coordinate = coordinate;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApiCoordinates getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(ApiCoordinates coordinate) {
        this.coordinate = coordinate;
    }

    public ApiCity getCity() {
        return city;
    }

    public void setCity(ApiCity city) {
        this.city = city;
    }

}
