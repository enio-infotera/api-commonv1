/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.dto.ApiCity;
import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiTerminal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAirport {

    private String code;
    private String airportName;
    private ApiCity city;
    @JsonProperty("terminal")
    private ApiTerminal terminal;

    private ApiCoordinates coordinates;

    public ApiAirport() {
    }

    public ApiAirport(String code, String airportName, ApiCity city, ApiTerminal terminal) {
        this.code = code;
        this.airportName = airportName;
        this.city = city;
        this.terminal = terminal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public ApiCity getCity() {
        return city;
    }

    public void setCity(ApiCity city) {
        this.city = city;
    }

    public ApiTerminal getTerminal() {
        return terminal;
    }

    public void setTerminal(ApiTerminal terminal) {
        this.terminal = terminal;
    }

    public ApiCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ApiCoordinates coordinates) {
        this.coordinates = coordinates;
    }
}
