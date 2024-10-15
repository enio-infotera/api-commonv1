/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiPrice;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaymentInstallment {

    private Integer value;
    private Double totalAmount;
    private ApiPrice price;

    public ApiPaymentInstallment() {
    }

    public ApiPaymentInstallment(Integer value, ApiPrice price) {
        this.value = value;
        this.price = price;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ApiPrice getPrice() {
        return price;
    }

    public void setPrice(ApiPrice price) {
        this.price = price;
    }

}
