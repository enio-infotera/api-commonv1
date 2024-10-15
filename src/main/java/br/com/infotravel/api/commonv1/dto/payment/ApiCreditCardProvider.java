/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCreditCardProvider {

    private String key;

    private Integer id;
    private String name;
    private String token;

    private Boolean isAllowThreeDS;
    private Boolean isAllowThreeDSWithoutFraudManagment;

    private String environment;

    public ApiCreditCardProvider() {
    }

    public ApiCreditCardProvider(String key, Integer id, String name, String token, Boolean isAllowThreeDS, Boolean isAllowThreeDSWithoutFraudManagment, String environment) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.token = token;
        this.isAllowThreeDS = isAllowThreeDS;
        this.isAllowThreeDSWithoutFraudManagment = isAllowThreeDSWithoutFraudManagment;
        this.environment = environment;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getIsAllowThreeDS() {
        return isAllowThreeDS;
    }

    public void setIsAllowThreeDS(Boolean isAllowThreeDS) {
        this.isAllowThreeDS = isAllowThreeDS;
    }

    public Boolean getIsAllowThreeDSWithoutFraudManagment() {
        return isAllowThreeDSWithoutFraudManagment;
    }

    public void setIsAllowThreeDSWithoutFraudManagment(Boolean isAllowThreeDSWithoutFraudManagment) {
        this.isAllowThreeDSWithoutFraudManagment = isAllowThreeDSWithoutFraudManagment;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

}
