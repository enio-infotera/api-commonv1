/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAddress {

    private String zipcode;
    private String address;
    private String number;
    private String complement;
    private ApiCity city;
    private String neighborhood;
    private ApiCoordinates coordinates;

    public ApiAddress() {
    }

    public ApiAddress(String zipcode, String address, String number, String complement, ApiCity city, String neighborhood, ApiCoordinates coordinates) {
        this.zipcode = zipcode;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.city = city;
        this.neighborhood = neighborhood;
        this.coordinates = coordinates;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public ApiCity getCity() {
        return city;
    }

    public void setCity(ApiCity city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public ApiCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ApiCoordinates coordinates) {
        this.coordinates = coordinates;
    }

}
