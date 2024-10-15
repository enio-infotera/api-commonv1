/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCancellationPenalty {
    private  String  name;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date from;
    private String description;
    private Double percent;
    private ApiPrice price;

    public ApiCancellationPenalty() {
    }

    public ApiCancellationPenalty(String name,Date from, String description, ApiPrice price, Double percent) {
        this.name= name;
        this.from = from;
        this.description = description;
        this.price = price;
        this.percent = percent;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

}
