/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.PersonType;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import br.com.infotravel.api.commonv1.utils.Utils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiClient {

    private Integer id;

    private String externalCode;
    private String name;
    private String password;
    private String lastName;
    private PersonType type;

    private ApiClientCategory category;
    private ApiAddress address;
    private List<ApiPhone> telephones;
    private String email;
    private List<ApiDocument> documents;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date birth;
    private String loginType;

    private String riskData;
    private String logo;

    private ApiImage image;

    public ApiClient() {
    }

    public ApiClient(Integer id) {
        this.id = id;
    }

    public ApiClient(Integer id, String name, PersonType type, ApiAddress address, List<ApiPhone> telephones, String email, List<ApiDocument> documents, Date birth, ApiClientCategory category, String loginType) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.telephones = telephones;
        this.email = email;
        this.documents = documents;
        this.birth = birth;
        this.category = category;
        this.loginType = loginType;
    }

    public ApiClient(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ApiClient(String name) {
        this.name = name;
    }

    public ApiClient(String name, List<ApiDocument> documents) {
        this.name = name;
        this.documents = documents;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public ApiAddress getAddress() {
        return address;
    }

    public void setAddress(ApiAddress address) {
        this.address = address;
    }

    public List<ApiPhone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<ApiPhone> telephones) {
        this.telephones = telephones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ApiDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<ApiDocument> documents) {
        this.documents = documents;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getRiskData() {
        return riskData;
    }

    public void setRiskData(String riskData) {
        this.riskData = riskData;
    }

    @JsonIgnore
    public String getTransFullName() {
        return Utils.isNull(name, "") + (lastName != null ? " " + lastName : "");
    }

    public ApiClientCategory getCategory() {
        return category;
    }

    public void setCategory(ApiClientCategory category) {
        this.category = category;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }
}
