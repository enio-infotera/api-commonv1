/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.bus;

import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingBus {

    private BookingStatus status;
    private List<ApiLocator> locators;
    private String provider;

    private List<ApiBus> busList;

    private List<ApiName> names;
    private List<ApiFare> fares;

    private List<ApiPolicy> policies;
    private ApiCancellationPolicy cancellationPolicies;

    public ApiBookingBus() {
    }

    public ApiBookingBus(List<ApiBus> busList, List<ApiName> names) {
        this.busList = busList;
        this.names = names;
    }

    public ApiBookingBus(List<ApiLocator> locators, List<ApiBus> busList, List<ApiName> names, List<ApiFare> fares, String provider, List<ApiPolicy> policies, ApiCancellationPolicy cancellationPolicies, BookingStatus status) {
        this.locators = locators;
        this.busList = busList;
        this.names = names;
        this.fares = fares;
        this.provider = provider;
        this.policies = policies;
        this.cancellationPolicies = cancellationPolicies;
        this.status = status;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public List<ApiLocator> getLocators() {
        return locators;
    }

    public void setLocators(List<ApiLocator> locators) {
        this.locators = locators;
    }

    public List<ApiBus> getBusList() {
        return busList;
    }

    public void setBusList(List<ApiBus> busList) {
        this.busList = busList;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ApiPolicy> policies) {
        this.policies = policies;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ApiCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(ApiCancellationPolicy cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

}
