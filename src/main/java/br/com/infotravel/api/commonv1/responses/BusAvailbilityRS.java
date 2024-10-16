package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.bus.ApiBusAvail;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusAvailbilityRS {

    @SerializedName("busAvail")
    private List<ApiBusAvail> apiBusAvails;
    private String message;

    public BusAvailbilityRS() {
    }

    public BusAvailbilityRS(List<ApiBusAvail> apiBusAvails) {
        this.apiBusAvails = apiBusAvails;
    }

    public List<ApiBusAvail> getApiBusAvails() {
        return apiBusAvails;
    }

    public void setApiBusAvails(List<ApiBusAvail> apiBusAvails) {
        this.apiBusAvails = apiBusAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
