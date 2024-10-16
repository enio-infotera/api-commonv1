package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.tour.ApiTourAvail;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TourAvailbilityRS {

    @JsonProperty("tourAvail")
    private List<ApiTourAvail> tourAvailList;
    private String message;

    public TourAvailbilityRS() {
    }

    public TourAvailbilityRS(List<ApiTourAvail> tourAvailList) {
        this.tourAvailList = tourAvailList;
    }

    public List<ApiTourAvail> getTourAvailList() {
        return tourAvailList;
    }

    public void setTourAvailList(List<ApiTourAvail> tourAvailList) {
        this.tourAvailList = tourAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
