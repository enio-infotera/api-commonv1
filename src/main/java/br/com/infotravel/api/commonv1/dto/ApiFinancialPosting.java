package br.com.infotravel.api.commonv1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiFinancialPosting {

    private Integer id;
    private String code;
    private String externalCode;
    private ApiPrice valueLaunch;
    private ApiPrice amount;
    private ApiPrice penaltyValue;
    private boolean paymentConfirmed;

    public ApiFinancialPosting() {
    }

    public ApiFinancialPosting(Integer id, String code, String externalCode, boolean paymentConfirmed) {
        this.id = id;
        this.code = code;
        this.externalCode = externalCode;
        this.paymentConfirmed = paymentConfirmed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public ApiPrice getValueLaunch() {
        return valueLaunch;
    }

    public void setValueLaunch(ApiPrice valueLaunch) {
        this.valueLaunch = valueLaunch;
    }

    public ApiPrice getAmount() {
        return amount;
    }

    public void setAmount(ApiPrice amount) {
        this.amount = amount;
    }

    public ApiPrice getPenaltyValue() {
        return penaltyValue;
    }

    public void setPenaltyValue(ApiPrice penaltyValue) {
        this.penaltyValue = penaltyValue;
    }

    public boolean isPaymentConfirmed() {
        return paymentConfirmed;
    }

    public void setPaymentConfirmed(boolean paymentConfirmed) {
        this.paymentConfirmed = paymentConfirmed;
    }
}
