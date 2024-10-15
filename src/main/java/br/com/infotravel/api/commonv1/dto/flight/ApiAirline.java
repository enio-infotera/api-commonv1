package br.com.infotravel.api.commonv1.dto.flight;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAirline {

    private String code;
    private String name;
    private String logo;

    public ApiAirline() {
    }

    public ApiAirline(String code, String name, String logo) {
        this.code = code;
        this.name = name;
        this.logo = logo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
