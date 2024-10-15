/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiHotelPriority {

    private String type;
    private String description;
    private String color;
    
    public ApiHotelPriority() {
    }

    public ApiHotelPriority(String type, String description) {
        this.type = type;
        this.description = description;
    }
    
    public ApiHotelPriority(String type, String description, String color) {
        this.type = type;
        this.description = description;
        this.color = color;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
