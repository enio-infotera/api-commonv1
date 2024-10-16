package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.chip.ApiChipAvail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChipAvailbilityRS {

    @SerializedName("chipAvail")
    private List<ApiChipAvail> chipAvailList;
    private String message;

    public ChipAvailbilityRS() {
    }

    public ChipAvailbilityRS(List<ApiChipAvail> chipAvailList) {
        this.chipAvailList = chipAvailList;
    }

    public List<ApiChipAvail> getChipAvailList() {
        return chipAvailList;
    }

    public void setChipAvailList(List<ApiChipAvail> chipAvailList) {
        this.chipAvailList = chipAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
