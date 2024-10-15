package br.com.infotravel.api.commonv1.dto.circuit;


import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotel;
import br.com.infotravel.api.commonv1.dto.packages.ApiRoadMap;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCircuit {
    private String key;
    private String name;
    private String code;
    private List<ApiImage> imageList;
    private List<ApiCircuitInfo> infos;
    private List<ApiHotel> hotels;
    private List<ApiRoadMap> roadMap;
    private List<ApiCircuitService> services;


    public ApiCircuit() {
    }

    public ApiCircuit(String key, String name, String code, List<ApiImage> imageList) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.imageList = imageList;

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public List<ApiImage> getImageList() {
        return imageList;
    }

    public void setImageList(List<ApiImage> imageList) {
        this.imageList = imageList;
    }

    public List<ApiCircuitInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<ApiCircuitInfo> infos) {
        this.infos = infos;
    }

    public List<ApiHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<ApiHotel> hotels) {
        this.hotels = hotels;
    }

    public List<ApiRoadMap> getRoadMap() {
        return roadMap;
    }

    public void setRoadMap(List<ApiRoadMap> roadMap) {
        this.roadMap = roadMap;
    }

    public List<ApiCircuitService> getServices() {
        return services;
    }

    public void setServices(List<ApiCircuitService> services) {
        this.services = services;
    }
}
