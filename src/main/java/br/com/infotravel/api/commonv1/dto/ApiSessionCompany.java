package br.com.infotravel.api.commonv1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSessionCompany {

    private ApiCompany company;
    private ApiToken apiToken;

    public ApiSessionCompany() {
    }

    public ApiSessionCompany(ApiCompany company, ApiToken apiToken) {
        this.company = company;
        this.apiToken = apiToken;
    }

    public ApiCompany getCompany() {
        return company;
    }

    public void setCompany(ApiCompany company) {
        this.company = company;
    }

    public ApiToken getApiToken() {
        return apiToken;
    }

    public void setApiToken(ApiToken apiToken) {
        this.apiToken = apiToken;
    }
}
