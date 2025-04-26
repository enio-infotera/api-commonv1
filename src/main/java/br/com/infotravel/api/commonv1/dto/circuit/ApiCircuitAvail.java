package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.dto.ApiBoardType;
import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoomGroup;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCircuitAvail {

    private ApiCircuit circuit;
    private List<ApiRoomGroup> roomGroups;
    private List<ApiBoardType> boardType;
    private List<ApiCircuitCategory> categories;
    private List<ApiItinerary> itineraryList;
    private List<ApiFare> fares;
    private String provider;
    private ApiClient providerDetail;

    public ApiCircuitAvail() {
    }

    public ApiCircuitAvail(ApiCircuit circuit, List<ApiRoomGroup> roomGroups, List<ApiBoardType> boardType) {
        this.circuit = circuit;
        this.roomGroups = roomGroups;
        this.boardType = boardType;
    }

    public ApiCircuit getCircuit() {
        return circuit;
    }

    public void setCircuit(ApiCircuit circuit) {
        this.circuit = circuit;
    }

    public List<ApiRoomGroup> getRoomGroups() {
        return roomGroups;
    }

    public void setRoomGroups(List<ApiRoomGroup> roomGroups) {
        this.roomGroups = roomGroups;
    }

    public List<ApiBoardType> getBoardType() {
        return boardType;
    }

    public void setBoardType(List<ApiBoardType> boardType) {
        this.boardType = boardType;
    }

    public List<ApiItinerary> getItineraryList() {
        return itineraryList;
    }

    public void setItineraryList(List<ApiItinerary> itineraryList) {
        this.itineraryList = itineraryList;
    }

    public List<ApiCircuitCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ApiCircuitCategory> categories) {
        this.categories = categories;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ApiClient getProviderDetail() {
        return providerDetail;
    }

    public void setProviderDetail(ApiClient providerDetail) {
        this.providerDetail = providerDetail;
    }

}
