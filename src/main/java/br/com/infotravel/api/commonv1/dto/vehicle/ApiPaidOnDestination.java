/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import br.com.infotravel.api.commonv1.dto.ApiPrice;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaidOnDestination implements Serializable {

    private String description;
    private ApiPrice price;

    public ApiPaidOnDestination() {
    }

    public ApiPaidOnDestination(String description, ApiPrice price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiPrice getPrice() {
        return price;
    }

    public void setPrice(ApiPrice price) {
        this.price = price;
    }

}
