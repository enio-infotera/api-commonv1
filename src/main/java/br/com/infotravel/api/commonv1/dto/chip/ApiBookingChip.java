package br.com.infotravel.api.commonv1.dto.chip;

import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingChip {

    private BookingStatus status;
    private List<ApiLocator> locators;
    private String provider;
    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date dateSelected;
    private ApiChip chip;

    private List<ApiName> names;
    private List<ApiFare> fares;

    private List<ApiPolicy> policies;
    private ApiCancellationPolicy cancellationPolicies;
    private List<String> providerUrls;

    private BookingStatus providerStatus;

    private List<ApiContact> contacts;
    private String urlWebHook;

    private ApiCoordinates coordinates;

    private String textDoc;

    public ApiBookingChip() {
    }

    public ApiBookingChip(ApiChip chip, Date dateSelected, List<ApiName> names) {
        this.chip = chip;
        this.names = names;
        this.dateSelected = dateSelected;
    }

    public ApiBookingChip(List<ApiLocator> locators, ApiChip chip, List<ApiName> names, List<ApiFare> fares, String provider, List<ApiPolicy> policies, ApiCancellationPolicy cancellationPolicies, BookingStatus status, BookingStatus providerStatus) {
        this.locators = locators;
        this.chip = chip;
        this.names = names;
        this.fares = fares;
        this.provider = provider;
        this.policies = policies;
        this.cancellationPolicies = cancellationPolicies;
        this.status = status;
        this.providerStatus = providerStatus;
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

    public Date getDateSelected() {
        return dateSelected;
    }

    public void setDateSelected(Date dateSelected) {
        this.dateSelected = dateSelected;
    }


    public ApiBookingChip(ApiChip chip) {
        this.chip = chip;
    }


    public ApiChip getChip() {
        return chip;
    }

    public void setChip(ApiChip chip) {
        this.chip = chip;
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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<ApiPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ApiPolicy> policies) {
        this.policies = policies;
    }

    public ApiCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(ApiCancellationPolicy cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public BookingStatus getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(BookingStatus providerStatus) {
        this.providerStatus = providerStatus;
    }

    public List<ApiContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ApiContact> contacts) {
        this.contacts = contacts;
    }

    public String getUrlWebHook() {
        return urlWebHook;
    }

    public void setUrlWebHook(String urlWebHook) {
        this.urlWebHook = urlWebHook;
    }

    public List<String> getProviderUrls() {
        return providerUrls;
    }

    public void setProviderUrls(List<String> providerUrls) {
        this.providerUrls = providerUrls;
    }

    public ApiCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ApiCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }
}
