/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import br.com.infotravel.api.commonv1.dto.ApiAddress;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.dto.ApiPointInterest;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiHotel {

    private Integer id;
    private String externalCode;
    private String keyDetail;
    private String name;
    private String description;
    private ApiAddress address;
    private Double stars;
    private String highlight;
    private ApiHotelPriority priority;
    private String checkInTime;
    private String checkOutTime;
    private List<ApiImage> images;
    private List<Integer> facilityIds;
    private List<ApiFacility> facilities;
    private List<ApiPolicy> policies;
    private List<ApiRoom> rooms;
    private List<ApiPointInterest> pointsOfInterest;

    public ApiHotel() {
    }

    public ApiHotel(Integer id) {
        this.id = id;
    }

    public ApiHotel(Integer id, String keyDetail, String name, String description, ApiAddress address, Double stars, String highlight, ApiHotelPriority priority, String checkInTime, String checkOutTime, List<ApiImage> images) {
        this.id = id;
        this.keyDetail = keyDetail;
        this.name = name;
        this.description = description;
        this.address = address;
        this.stars = stars;
        this.highlight = highlight;
        this.priority = priority;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.images = images;
    }

    public ApiHotel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getKeyDetail() {
        return keyDetail;
    }

    public void setKeyDetail(String keyDetail) {
        this.keyDetail = keyDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiAddress getAddress() {
        return address;
    }

    public void setAddress(ApiAddress address) {
        this.address = address;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public ApiHotelPriority getPriority() {
        return priority;
    }

    public void setPriority(ApiHotelPriority priority) {
        this.priority = priority;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

    public List<Integer> getFacilityIds() {
        return facilityIds;
    }

    public void setFacilityIds(List<Integer> facilityIds) {
        this.facilityIds = facilityIds;
    }

    public List<ApiFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<ApiFacility> facilities) {
        this.facilities = facilities;
    }

    public List<ApiPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ApiPolicy> policies) {
        this.policies = policies;
    }

    public List<ApiRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ApiRoom> rooms) {
        this.rooms = rooms;
    }

    public List<ApiPointInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(List<ApiPointInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

}
