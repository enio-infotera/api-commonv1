package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiPrice;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaymentPix extends ApiPayment {

    private String key;
    private String qrCode;
    private Integer secondsExpiration;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date expirationDate;

    public ApiPaymentPix() {
    }

    public ApiPaymentPix(Integer id, String ip, String fingerprint, String description, ApiClient client, ApiPrice value, String key, String qrCode, Integer secondsExpiration, Date expirationDate, Boolean paymentConfirmed) {
        super(id, ip, fingerprint, description, client, value);
        this.key = key;
        this.qrCode = qrCode;
        this.secondsExpiration = secondsExpiration;
        this.expirationDate = expirationDate;
        this.setPaymentConfirmed(paymentConfirmed);
    }

    public ApiPaymentPix(Integer id, Boolean paymentConfirmed) {
        super(id, null, null, null, null, null);
        this.setPaymentConfirmed(paymentConfirmed);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Integer getSecondsExpiration() {
        return secondsExpiration;
    }

    public void setSecondsExpiration(Integer secondsExpiration) {
        this.secondsExpiration = secondsExpiration;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
