/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.GenderType;
import br.com.infotravel.api.commonv1.enumerators.NameType;

import java.util.Date;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiName {

    private String firstName;
    private String lastName;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date birth;
    private Integer age;
    private Integer roomNumber;
    private NameType type;

    private GenderType gender;
    private ApiDocument document;

    private List<ApiDocument> documents;

    private List<ApiNameDetail> nameDetails;

    private List<ApiLocator> apiLocators;

    private List<ApiFare> fares;

    private  String parameter;

    private Boolean isMain;

    public ApiName() {
    }

    public ApiName(String firstName, String lastName, Date birth, Integer age, Integer roomNumber, NameType type, ApiDocument document, Boolean isMain) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.age = age;
        this.roomNumber = roomNumber;
        this.type = type;
        this.document = document;
        this.isMain = isMain;
    }

    public ApiName(String firstName, String lastName, Date birth, Integer age, NameType type, ApiDocument document, List<ApiNameDetail> nameDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.age = age;
        this.type = type;
        this.document = document;
        this.nameDetails = nameDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public NameType getType() {
        return type;
    }

    public void setType(NameType type) {
        this.type = type;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ApiDocument getDocument() {
        return document;
    }

    public void setDocument(ApiDocument document) {
        this.document = document;
    }

    public List<ApiDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<ApiDocument> documents) {
        this.documents = documents;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean main) {
        isMain = main;
    }

    public List<ApiNameDetail> getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(List<ApiNameDetail> nameDetails) {
        this.nameDetails = nameDetails;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public List<ApiLocator> getApiLocators() {
        return apiLocators;
    }

    public void setApiLocators(List<ApiLocator> apiLocators) {
        this.apiLocators = apiLocators;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }
}
