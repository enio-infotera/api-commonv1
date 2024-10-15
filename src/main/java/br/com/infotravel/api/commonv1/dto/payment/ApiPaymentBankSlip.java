/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiBank;
import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiPrice;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaymentBankSlip extends ApiPayment {

    private String url;
    private ApiPrice price;
    private ApiBank bank;
    private List<ApiPaymentInstallment> installments;

    private List<ApiPaymentBankSlip> options;

    private String authorizationCode;

    public ApiPaymentBankSlip() {
    }

    public ApiPaymentBankSlip(List<ApiPaymentBankSlip> options) {
        this.options = options;
    }

    public ApiPaymentBankSlip(Integer id, String ip, String fingerprint, String description, ApiClient client, ApiPrice value, ApiBank bank, String dsUrlBoleto, List<ApiPaymentInstallment> installments) {
        super(id, ip, fingerprint, description, client, value);
        this.bank = bank;
        this.url = dsUrlBoleto;
        this.installments = installments;
    }

    public ApiPaymentBankSlip(Integer id, String ip, String fingerprint, String description, ApiClient client, ApiPrice value, ApiBank bank, String dsUrlBoleto, List<ApiPaymentInstallment> installments, String authorizationCode) {
        super(id, ip, fingerprint, description, client, value);
        this.bank = bank;
        this.url = dsUrlBoleto;
        this.installments = installments;
        this.authorizationCode = authorizationCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ApiPaymentInstallment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<ApiPaymentInstallment> installments) {
        this.installments = installments;
    }

    public ApiPrice getPrice() {
        return price;
    }

    public void setPrice(ApiPrice price) {
        this.price = price;
    }

    public ApiBank getBank() {
        return bank;
    }

    public void setBank(ApiBank bank) {
        this.bank = bank;
    }

    public List<ApiPaymentBankSlip> getOptions() {
        return options;
    }

    public void setOptions(List<ApiPaymentBankSlip> options) {
        this.options = options;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }
}
