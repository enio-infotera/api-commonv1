/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.LocatorType;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiLocator {

    private String code;
    private LocatorType type;

    public ApiLocator() {
    }

    public ApiLocator(String code, LocatorType type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocatorType getType() {
        return type;
    }

    public void setType(LocatorType type) {
        this.type = type;
    }

}
