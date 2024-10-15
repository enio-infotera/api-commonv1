/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import br.com.infotravel.api.commonv1.enumerators.FuelType;
import br.com.infotravel.api.commonv1.enumerators.VehicleDetailType;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiVehicleDetail implements Serializable {

    private String name;
    private VehicleDetailType type;
    private String description;
    private FuelType fuelType;

    public ApiVehicleDetail() {
    }

    public ApiVehicleDetail(String name, VehicleDetailType type, String description, FuelType fuelType) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.fuelType = fuelType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleDetailType getType() {
        return type;
    }

    public void setType(VehicleDetailType type) {
        this.type = type;
    }

}
