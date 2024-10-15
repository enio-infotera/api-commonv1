/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.packages;

/**
 *
 * @author enioj
 */
import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRoadMap {

    private Integer sqDay;

    private String name;

    private String description;

    private List<ApiImage> images;

    private ApiCoordinates coordinates;

    public ApiRoadMap() {
    }

    public ApiRoadMap(Integer sqDay, String name, String description) {
        this.sqDay = sqDay;
        this.name = name;
        this.description = description;
    }

    public Integer getSqDay() {
        return sqDay;
    }

    public void setSqDay(Integer sqDay) {
        this.sqDay = sqDay;
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

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

    public ApiCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ApiCoordinates coordinates) {
        this.coordinates = coordinates;
    }

}
