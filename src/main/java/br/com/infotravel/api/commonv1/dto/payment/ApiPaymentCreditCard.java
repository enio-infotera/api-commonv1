/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiPrice;
import br.com.infotravel.api.commonv1.enumerators.CardBrandType;
import br.com.infotravel.api.commonv1.enumerators.CardPaymentStatus;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaymentCreditCard extends ApiPayment {

    private CardBrandType brand;
    private ApiPaymentInstallment installment;
    private List<ApiPaymentInstallment> installments;

    private String holderName;
    private String cardNumber;
    private String securityCode;
    private String expirationMonth;
    private String expirationYear;

    private CardPaymentStatus status;

    private String authorizationNumber;

    private String nsu;//aprovacao
    private String tid;
    private String token;
    private String externalCode;
    private String message;
    private String antiFraud;//NO:NÃO UTILIZADO; AP:APROVADO; NE:NEGADO; AN:EM ANALISE; VE:VERIFICA;3DS:CIELO 3DS; MAQ:MAQUINETA 
    private String transactionId;
    private String redirectURL;

    private List<ApiPaymentCreditCard> options;

    private ApiCreditCardProvider provider;

    private String paymentMethodThreeDS;

    public ApiPaymentCreditCard() {
    }

    public ApiPaymentCreditCard(List<ApiPaymentCreditCard> options) {
        this.options = options;
    }

    public ApiPaymentCreditCard(CardBrandType brand, ApiPaymentInstallment installment, List<ApiPaymentInstallment> installments, String ip, String fingerprint, String description, ApiClient client, ApiPrice value, String holderName, String cardNumber, String securityCode, String expirationMonth, String expirationYear, String authorizationNumber) {
        super(ip, fingerprint, description, client, value);
        this.brand = brand;
        this.installment = installment;
        this.installments = installments;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.authorizationNumber = authorizationNumber;
    }

    public ApiPaymentCreditCard(CardBrandType brand, ApiPaymentInstallment installment, List<ApiPaymentInstallment> installments) {
        this.brand = brand;
        this.installment = installment;
        this.installments = installments;
    }

    public ApiPaymentCreditCard(CardBrandType brand, ApiPaymentInstallment installment, String holderName, String cardNumber, String securityCode, String expirationMonth, String expirationYear, CardPaymentStatus status, String authorizationNumber, String nsu, String tid, String token, String externalCode, String message, String antiFraud, String transactionId, String redirectURL) {
        this.brand = brand;
        this.installment = installment;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.status = status;
        this.authorizationNumber = authorizationNumber;
        this.nsu = nsu;
        this.tid = tid;
        this.token = token;
        this.externalCode = externalCode;
        this.message = message;
        this.antiFraud = antiFraud;
        this.transactionId = transactionId;
        this.redirectURL = redirectURL;
    }

    public CardBrandType getBrand() {
        return brand;
    }

    public void setBrand(CardBrandType brand) {
        this.brand = brand;
    }

    public ApiPaymentInstallment getInstallment() {
        return installment;
    }

    public void setInstallment(ApiPaymentInstallment installment) {
        this.installment = installment;
    }

    public List<ApiPaymentInstallment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<ApiPaymentInstallment> installments) {
        this.installments = installments;
    }

    public List<ApiPaymentCreditCard> getOptions() {
        return options;
    }

    public void setOptions(List<ApiPaymentCreditCard> options) {
        this.options = options;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public CardPaymentStatus getStatus() {
        return status;
    }

    public void setStatus(CardPaymentStatus status) {
        this.status = status;
    }

    public ApiCreditCardProvider getProvider() {
        return provider;
    }

    public void setProvider(ApiCreditCardProvider provider) {
        this.provider = provider;
    }

    public String getPaymentMethodThreeDS() {
        return paymentMethodThreeDS;
    }

    public void setPaymentMethodThreeDS(String paymentMethodThreeDS) {
        this.paymentMethodThreeDS = paymentMethodThreeDS;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAntiFraud() {
        return antiFraud;
    }

    public void setAntiFraud(String antiFraud) {
        this.antiFraud = antiFraud;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

}
