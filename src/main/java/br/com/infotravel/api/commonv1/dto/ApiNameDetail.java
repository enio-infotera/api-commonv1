package br.com.infotravel.api.commonv1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiNameDetail {

    private String code;
    private String title;
    private String description;
    private String value;
    private Boolean required;
    private String mask;

    public ApiNameDetail() {
    }

    public ApiNameDetail(String code, String title, String description, String value, Boolean required, String mask) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.value = value;
        this.required = required;
        this.mask = mask;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
