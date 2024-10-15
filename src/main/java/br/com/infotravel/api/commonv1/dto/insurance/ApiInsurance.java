/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.insurance;

import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiInsurance {

    private String provider;
    private String key;
    private String code;
    private String name;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date startDate;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
    private String description;
    private Boolean unique;

    private Boolean onRequest;
    private ApiImage image;
    private ApiCoordinates coordinates;

    private List<ApiInsuranceCoverage> coverages;
    private List<ApiInsuranceUpgrade> upgrades;

    private String duration;
    private String observation;
    private String touristGuide;
    private String frequency;
    private List<String> included;
    private List<String> notIncluded;

    public ApiInsurance() {
    }

    public ApiInsurance(String key) {
        this.key = key;
    }

    public ApiInsurance(String key, String code, String name, Date startDate, Date endDate, String description, Boolean unique, ApiImage image, Boolean onRequest, List<ApiInsuranceCoverage> coverages, List<ApiInsuranceUpgrade> upgrades, String provider, ApiCoordinates coordinates) {
        this.key = key;
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.unique = unique;
        this.image = image;
        this.onRequest = onRequest;
        this.coverages = coverages;
        this.upgrades = upgrades;
        this.provider = provider;
        this.coordinates = coordinates;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }

    public List<ApiInsuranceCoverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<ApiInsuranceCoverage> coverages) {
        this.coverages = coverages;
    }

    public List<ApiInsuranceUpgrade> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(List<ApiInsuranceUpgrade> upgrades) {
        this.upgrades = upgrades;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getOnRequest() {
        return onRequest;
    }

    public void setOnRequest(Boolean onRequest) {
        this.onRequest = onRequest;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ApiCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ApiCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTouristGuide() {
        return touristGuide;
    }

    public void setTouristGuide(String touristGuide) {
        this.touristGuide = touristGuide;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<String> getIncluded() {
        return included;
    }

    public void setIncluded(List<String> included) {
        this.included = included;
    }

    public List<String> getNotIncluded() {
        return notIncluded;
    }

    public void setNotIncluded(List<String> notIncluded) {
        this.notIncluded = notIncluded;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

}
