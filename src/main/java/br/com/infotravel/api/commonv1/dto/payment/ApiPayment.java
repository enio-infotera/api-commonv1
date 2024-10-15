/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiCredential;
import br.com.infotravel.api.commonv1.dto.ApiIntegrador;
import br.com.infotravel.api.commonv1.dto.ApiPrice;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author enioj
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ApiPaymentInvoice.class, name = "INVOICE"),
    @JsonSubTypes.Type(value = ApiPaymentCreditCard.class, name = "CREDIT_CARD"),
    @JsonSubTypes.Type(value = ApiPaymentPix.class, name = "PIX"),
    @JsonSubTypes.Type(value = ApiPaymentBankSlip.class, name = "BANK_SLIP"),
    @JsonSubTypes.Type(value = ApiPaymentHotel.class, name = "IN_HOTEL")
})
public abstract class ApiPayment {

    private Integer id;
    private String ip;
    private String fingerprint;
    private String description;
    private ApiClient client;
    private ApiPrice value;

    private Boolean paymentConfirmed;

    private ApiIntegrador integrador;
    private ApiCredential credential;

    public ApiPayment() {
    }

    public ApiPayment(String ip, String fingerprint, String description, ApiClient client, ApiPrice value) {
        this.ip = ip;
        this.fingerprint = fingerprint;
        this.description = description;
        this.client = client;
        this.value = value;
    }

    public ApiPayment(Integer id, String ip, String fingerprint, String description, ApiClient client, ApiPrice value) {
        this.id = id;
        this.ip = ip;
        this.fingerprint = fingerprint;
        this.description = description;
        this.client = client;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiClient getClient() {
        return client;
    }

    public void setClient(ApiClient client) {
        this.client = client;
    }

    public ApiPrice getValue() {
        return value;
    }

    public void setValue(ApiPrice value) {
        this.value = value;
    }

    public Boolean getPaymentConfirmed() {
        return paymentConfirmed;
    }

    public void setPaymentConfirmed(Boolean paymentConfirmed) {
        this.paymentConfirmed = paymentConfirmed;
    }

    public ApiIntegrador getIntegrador() {
        return integrador;
    }

    public void setIntegrador(ApiIntegrador integrador) {
        this.integrador = integrador;
    }

    public ApiCredential getCredential() {
        return credential;
    }

    public void setCredential(ApiCredential credential) {
        this.credential = credential;
    }

}
