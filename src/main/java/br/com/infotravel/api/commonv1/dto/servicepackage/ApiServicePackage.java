package br.com.infotravel.api.commonv1.dto.servicepackage;

import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.dto.transfer.ApiTransferSegment;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiServicePackage {

    private String provider;
    private String key;
    private String code;
    private String name;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date date;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
    private String description;
    private Boolean unique;

    private Boolean onRequest;
    private ApiImage image;
    private ApiCoordinates coordinates;

    private List<ApiTransferSegment> segments;

    private String duration;
    private String observation;
    private String touristGuide;
    private String frequency;
    private List<String> included;
    private List<String> notIncluded;

    public ApiServicePackage() {
    }

    public ApiServicePackage(String key) {
        this.key = key;
    }

    public ApiServicePackage(String key, String code, String name, Date date, String description, Boolean unique, ApiImage image, Boolean onRequest, String provider, ApiCoordinates coordinates) {
        this.key = key;
        this.code = code;
        this.name = name;
        this.date = date;
        this.description = description;
        this.unique = unique;
        this.onRequest = onRequest;
        this.image = image;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public List<ApiTransferSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<ApiTransferSegment> segments) {
        this.segments = segments;
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
