/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiWhiteLabel {

    private Integer id;
    private String key;
    private String name;
    private String url;
    private String logo;
    private boolean enable;
    private ApiPhone phone;

    public ApiWhiteLabel() {
    }

    public ApiWhiteLabel(Integer id, String key, String name, String url, String logo, boolean enable, ApiPhone phone) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.url = url;
        this.logo = logo;
        this.enable = enable;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public ApiPhone getPhone() {
        return phone;
    }

    public void setPhone(ApiPhone phone) {
        this.phone = phone;
    }

}
