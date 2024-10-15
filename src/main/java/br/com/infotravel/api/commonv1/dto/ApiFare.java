/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.FareType;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiFare {

    private FareType type;
    private String code;
    private String description;
    private ApiPrice price;

    private ApiPrice priceSale;
    private ApiPrice priceNet;

    private Boolean isFareRate;

    private boolean isDiscount;

    private ApiPrice point;

    public ApiFare() {
    }

    public ApiFare(FareType type, String code, String description, ApiPrice price, ApiPrice priceNet, ApiPrice point, Boolean isFareRate) {
        this.type = type;
        this.code = code;
        this.description = description;
        this.price = price;
        this.priceNet = priceNet;
        this.point = point;
        this.isFareRate = isFareRate;
    }

    public FareType getType() {
        return type;
    }

    public void setType(FareType type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public ApiPrice getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(ApiPrice priceNet) {
        this.priceNet = priceNet;
    }

    public Boolean getIsFareRate() {
        return isFareRate;
    }

    public void setIsFareRate(Boolean isFareRate) {
        this.isFareRate = isFareRate;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public ApiPrice getPoint() {
        return point;
    }

    public void setPoint(ApiPrice point) {
        this.point = point;
    }

    public ApiPrice getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(ApiPrice priceSale) {
        this.priceSale = priceSale;
    }

}
