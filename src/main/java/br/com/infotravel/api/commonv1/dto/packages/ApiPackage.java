/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.packages;

import br.com.infotravel.api.commonv1.dto.ApiImage;

import java.util.Date;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;


/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPackage {


    private String key;

    private Integer id;

    private String keyDetail;


    private String name;

    private String description;

    private String observation;


    private String origin;

    private String destination;


    private Integer days;

    private Integer nights;

    private List<String> tags;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date start;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date end;

    private List<ApiImage> images;

    private List<ApiRoadMap> roadMap;

    public ApiPackage() {
    }

    public ApiPackage(Integer id, String key) {
        this.id = id;
        this.key = key;
    }

    public ApiPackage(String key, Integer id, String name, String description, String observation, String origin, String destination, Integer days, Integer nights, Date start, Date end, List<ApiImage> images, List<ApiRoadMap> roadMap) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.description = description;
        this.observation = observation;
        this.origin = origin;
        this.destination = destination;
        this.days = days;
        this.nights = nights;
        this.start = start;
        this.end = end;
        this.images = images;
        this.roadMap = roadMap;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getKeyDetail() {
        return keyDetail;
    }

    public void setKeyDetail(String keyDetail) {
        this.keyDetail = keyDetail;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

    public List<ApiRoadMap> getRoadMap() {
        return roadMap;
    }

    public void setRoadMap(List<ApiRoadMap> roadMap) {
        this.roadMap = roadMap;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

}
