package br.com.infotravel.api.commonv1.dto.ticket;

import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiCoordinates;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingTicket {

    private BookingStatus status;
    private List<ApiLocator> locators;
    private String provider;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateSelected;
    private ApiTicket ticket;

    private List<ApiName> names;
    private List<ApiFare> fares;
    private ApiTicketModalitie modalitie;

    private BookingStatus providerStatus;

    private List<ApiPolicy> policies;
    private ApiCancellationPolicy cancellationPolicies;
    private List<String> providerUrls;

    private List<ApiContact> contacts;
    private String urlWebHook;

    private ApiCoordinates coordinates;

    private String textDoc;

    public ApiBookingTicket() {
    }

    public ApiBookingTicket(ApiTicket ticket, Date dateSelected, List<ApiName> names, ApiTicketModalitie modalitie) {
        this.ticket = ticket;
        this.names = names;
        this.modalitie = modalitie;
    }

    public ApiBookingTicket(List<ApiLocator> locators, ApiTicket ticket, List<ApiName> names, List<ApiFare> fares, String provider, List<ApiPolicy> policies, ApiCancellationPolicy cancellationPolicies, BookingStatus status, BookingStatus providerStatus) {
        this.locators = locators;
        this.ticket = ticket;
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

    public ApiTicket getTicket() {
        return ticket;
    }

    public void setTicket(ApiTicket ticket) {
        this.ticket = ticket;
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

    public ApiTicketModalitie getModalitie() {
        return modalitie;
    }

    public void setModalitie(ApiTicketModalitie modalitie) {
        this.modalitie = modalitie;
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

    public List<String> getProviderUrls() {
        return providerUrls;
    }

    public void setProviderUrls(List<String> providerUrls) {
        this.providerUrls = providerUrls;
    }

    public BookingStatus getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(BookingStatus providerStatus) {
        this.providerStatus = providerStatus;
    }

    public String getUrlWebHook() {
        return urlWebHook;
    }

    public void setUrlWebHook(String urlWebHook) {
        this.urlWebHook = urlWebHook;
    }

    public List<ApiContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ApiContact> contacts) {
        this.contacts = contacts;
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
