/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiFacility {

    private Integer id;
    private String name;
    private List<ApiFacilityItem> items;

    public ApiFacility() {
    }

    public ApiFacility(Integer id, String name, List<ApiFacilityItem> items) {
        this.id = id;
        this.name = name;
        this.items = items;
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

    public List<ApiFacilityItem> getItems() {
        return items;
    }

    public void setItems(List<ApiFacilityItem> items) {
        this.items = items;
    }

}
