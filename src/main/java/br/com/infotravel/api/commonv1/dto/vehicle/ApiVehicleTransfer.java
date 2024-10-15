/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import br.com.infotravel.api.commonv1.enumerators.VehicleTransferType;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiVehicleTransfer implements Serializable {

    private String name;
    private String description;
    private Integer capacity;
    private VehicleTransferType type;

    public ApiVehicleTransfer() {
    }

    public ApiVehicleTransfer(String name, String description, Integer capacity, VehicleTransferType type) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.type = type;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public VehicleTransferType getType() {
        return type;
    }

    public void setType(VehicleTransferType type) {
        this.type = type;
    }

}
