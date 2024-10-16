/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.vehicle;

import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiVehicle implements Serializable {

    private String key;

    private String name;
    private String code;
    private String description;
    private String category;
    private ApiVehicleLocal pickUpLocation;
    private ApiVehicleLocal dropOffLocation;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date pickUpDate;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dropOffDate;
    @SerializedName("class")
    private String nmClasse;
    private String model;
    private List<ApiVehicleDetail> vehicleDetails;
    private ApiVehicleRentalCompany rentalCompany;
    private List<ApiImage> images;
    private List<ApiVehicleFareOption> fareOptions;
    private ApiAdditionalInformation additionalInformation;

    public ApiVehicle() {
    }

    public ApiVehicle(String name, String code, String description, String category, ApiVehicleLocal pickUpLocation, ApiVehicleLocal dropOffLocation, Date pickUpDate, Date dropOffDate, String nmClasse, String model, List<ApiVehicleDetail> vehicleDetails, ApiVehicleRentalCompany rentalCompany, List<ApiImage> images, List<ApiVehicleFareOption> fareOptions, ApiAdditionalInformation additionalInformation) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.category = category;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.nmClasse = nmClasse;
        this.model = model;
        this.vehicleDetails = vehicleDetails;
        this.rentalCompany = rentalCompany;
        this.images = images;
        this.fareOptions = fareOptions;
        this.additionalInformation = additionalInformation;
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

    public ApiVehicleLocal getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(ApiVehicleLocal pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public ApiVehicleLocal getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(ApiVehicleLocal dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public String getNmClasse() {
        return nmClasse;
    }

    public void setNmClasse(String nmClasse) {
        this.nmClasse = nmClasse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ApiVehicleDetail> getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(List<ApiVehicleDetail> vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public ApiVehicleRentalCompany getRentalCompany() {
        return rentalCompany;
    }

    public void setRentalCompany(ApiVehicleRentalCompany rentalCompany) {
        this.rentalCompany = rentalCompany;
    }

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

    public List<ApiVehicleFareOption> getFareOptions() {
        return fareOptions;
    }

    public void setFareOptions(List<ApiVehicleFareOption> fareOptions) {
        this.fareOptions = fareOptions;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ApiAdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(ApiAdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

}
