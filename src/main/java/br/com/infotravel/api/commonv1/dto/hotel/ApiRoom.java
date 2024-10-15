/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import br.com.infotravel.api.commonv1.dto.ApiBoardType;
import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;

import java.util.Date;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRoom {

    private String key;
    private Integer quantity;
    private ApiRoomType roomType;
    private List<ApiFare> fares;
    private ApiBoardType boardType;
    private String code;
    private String category;
    private String area;
    private String description;
    private ApiCancellationPolicy cancellationPolicies;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkIn;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date checkOut;
    private String remarks;
    private Boolean available;
    private List<ApiPolicy> policies;
    private List<ApiFacility> facilities;

    private List<ApiName> names;

    private List<ApiImage> images;

    public ApiRoom() {
    }

    public ApiRoom(String key, List<ApiName> names) {
        this.key = key;
        this.names = names;
    }

    public ApiRoom(String description, String category, String code, List<ApiFacility> facilities) {
        this.code = code;
        this.category = category;
        this.description = description;
        this.facilities = facilities;
    }

    public ApiRoom(String key, Integer quantity, ApiRoomType roomType, List<ApiFare> fares, ApiBoardType boardType, ApiCancellationPolicy cancellationPolicies, Date checkIn, Date checkOut, String remarks, Boolean available, List<ApiPolicy> policies, List<ApiName> names) {
        this.key = key;
        this.quantity = quantity;
        this.roomType = roomType;
        this.fares = fares;
        this.boardType = boardType;
        this.cancellationPolicies = cancellationPolicies;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.remarks = remarks;
        this.available = available;
        this.policies = policies;
        this.names = names;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ApiRoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(ApiRoomType roomType) {
        this.roomType = roomType;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public ApiBoardType getBoardType() {
        return boardType;
    }

    public void setBoardType(ApiBoardType boardType) {
        this.boardType = boardType;
    }

    public ApiCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(ApiCancellationPolicy cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<ApiPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ApiPolicy> policies) {
        this.policies = policies;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

    public List<ApiFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<ApiFacility> facilities) {
        this.facilities = facilities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

}
