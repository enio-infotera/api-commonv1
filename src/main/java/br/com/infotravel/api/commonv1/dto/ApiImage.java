/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

/**
 * @author enioj
 */

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiImage {

    private String large;
    private String medium;
    private String small;

    private String standard;

    public ApiImage() {
    }

    public ApiImage(String large, String medium, String small) {
        this.large = large;
        this.medium = medium;
        this.small = small;
    }

    public ApiImage(String large, String medium, String small, String standard) {
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.standard = standard;
    }

    public ApiImage(String standard) {
        this.standard = standard;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
