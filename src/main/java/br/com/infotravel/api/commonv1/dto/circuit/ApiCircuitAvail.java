package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.dto.ApiBoardType;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoomGroup;

import java.util.List;

public class ApiCircuitAvail {

    private ApiCircuit circuit;

    private List<ApiRoomGroup> roomGroups;
    private List<ApiBoardType> boardType;

    private List<ApiItinerary> itineraryList;

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
}
