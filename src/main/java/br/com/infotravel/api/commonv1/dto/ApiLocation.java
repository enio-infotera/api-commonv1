/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import java.io.Serializable;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiLocation implements Serializable {

    private Integer id;
    private String name;
    private String type;
    private String iata;

    public ApiLocation() {
    }

    public ApiLocation(Integer id) {
        this.id = id;
    }

    public ApiLocation(Integer id, String name, String type, String iata) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.iata = iata;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

}
