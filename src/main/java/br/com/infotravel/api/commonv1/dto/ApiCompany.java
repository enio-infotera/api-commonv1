package br.com.infotravel.api.commonv1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCompany {

    private Integer id;
    private String name;
    private String authenticatorName;
    private Integer agency;

    public ApiCompany() {
    }

    public ApiCompany(Integer id, String name, String authenticatorName, Integer agency) {
        this.id = id;
        this.name = name;
        this.authenticatorName = authenticatorName;
        this.agency = agency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthenticatorName() {
        return authenticatorName;
    }

    public void setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }
}
