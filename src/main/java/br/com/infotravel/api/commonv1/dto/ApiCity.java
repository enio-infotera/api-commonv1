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
public class ApiCity {

    private Integer id;
    private String name;
    private String state;
    private ApiCountry country;

    public ApiCity() {
    }

    public ApiCity(Integer id, String name, String state, ApiCountry country) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ApiCountry getCountry() {
        return country;
    }

    public void setCountry(ApiCountry country) {
        this.country = country;
    }

}
