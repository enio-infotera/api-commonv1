/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import br.com.infotravel.api.commonv1.dto.ApiAddress;
import br.com.infotravel.api.commonv1.dto.ApiPhone;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiVehicleLocal  implements Serializable{

    private String code;
    private String name;
    private ApiPhone telephone;
    private ApiAddress address;
    private String logo;

    public ApiVehicleLocal() {
    }

    public ApiVehicleLocal(String code, String name, ApiPhone telephone, ApiAddress address) {
        this.code = code;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiPhone getTelephone() {
        return telephone;
    }

    public void setTelephone(ApiPhone telephone) {
        this.telephone = telephone;
    }

    public ApiAddress getAddress() {
        return address;
    }

    public void setAddress(ApiAddress address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
