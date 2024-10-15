/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiVehicleAvail implements Serializable {

    private String provider;
    private String group;
    private List<ApiVehicle> vehicles;

    public ApiVehicleAvail() {
    }

    public ApiVehicleAvail(String group, List<ApiVehicle> vehicles) {
        this.group = group;
        this.vehicles = vehicles;
    }

    public ApiVehicleAvail(String provider, String group, List<ApiVehicle> vehicles) {
        this.provider = provider;
        this.group = group;
        this.vehicles = vehicles;
    }

    public String getGroup() {
        return group;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<ApiVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<ApiVehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
