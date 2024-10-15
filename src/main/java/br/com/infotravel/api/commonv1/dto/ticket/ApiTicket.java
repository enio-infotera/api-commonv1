package br.com.infotravel.api.commonv1.dto.ticket;

import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTicket {

    private String provider;
    private String key;
    private String name;
    private String code;
    private String description;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date start;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date end;
    private Boolean unique;

    private Boolean onRequest;
    private ApiImage image;
    private ApiCoordinates coordinates;

    private String duration;
    private String observation;
    private String touristGuide;
    private String frequency;
    private List<String> included;
    private List<String> notIncluded;

    public ApiTicket() {
    }

    public ApiTicket(String key) {
        this.key = key;
    }

    public ApiTicket(String key, String name, String code, String description, Date start, Date end, Boolean unique, ApiImage image, Boolean onRequest, String provider, ApiCoordinates coordinates) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.description = description;
        this.start = start;
        this.end = end;
        this.unique = unique;
        this.image = image;
        this.onRequest = onRequest;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
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
