/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.CurrencyType;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPrice {

    private CurrencyType currency;
    private Double amount;
    private Double percent;
    private Double coefficient;
    private Double exchange;
    private String description;
    private List<ApiDiscount> discounts;

    public ApiPrice() {
    }

    public ApiPrice(CurrencyType currency, Double amount, String description, List<ApiDiscount> discounts) {
        this.currency = currency;
        this.amount = amount;
        this.description = description;
        this.discounts = discounts;
    }

    public ApiPrice(CurrencyType currency, Double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<ApiDiscount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<ApiDiscount> discounts) {
        this.discounts = discounts;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public Double getExchange() {
        return exchange;
    }

    public void setExchange(Double exchange) {
        this.exchange = exchange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
