package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.dto.ApiCancellationPolicy;
import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiContact;
import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.dto.ApiPolicy;
import br.com.infotravel.api.commonv1.dto.hotel.ApiRoom;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingCircuit {

    private BookingStatus status;
    private BookingStatus providerStatus;
    private List<ApiLocator> locators;

    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date dateSelected;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date date;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
    private String provider;
    private ApiClient providerDetail;
    private Integer providerId;
    private ApiCircuit circuit;
    private List<ApiCircuitDay> dates;
    private List<ApiRoom> rooms;
    private Integer nights;
    private List<ApiCircuitCategory> categories;
    private ApiCircuitCategory category;
    private List<ApiContact> contacts;
    private List<ApiFare> fares;
    private List<ApiPolicy> policies;
    private ApiCancellationPolicy cancellationPolicies;
    private ApiItinerary itinerary;
    private boolean available;
    private Integer destinationId;
    private ApiCircuitExtraNight circuitExtraNight;
    private String textDoc;
    private String urlWebHook;

    public ApiBookingCircuit() {
    }

    public ApiBookingCircuit(ApiCircuit circuit, List<ApiRoom> rooms) {
        this.circuit = circuit;
        this.rooms = rooms;
    }

    // CheckRate
    public ApiBookingCircuit(ApiCircuit circuit, List<ApiRoom> rooms, ApiCircuitCategory category) {
        this.circuit = circuit;
        this.rooms = rooms;
        this.category = category;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public BookingStatus getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(BookingStatus providerStatus) {
        this.providerStatus = providerStatus;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ApiCircuitDay> getDates() {
        return dates;
    }

    public void setDates(List<ApiCircuitDay> dates) {
        this.dates = dates;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ApiClient getProviderDetail() {
        return providerDetail;
    }

    public void setProviderDetail(ApiClient providerDetail) {
        this.providerDetail = providerDetail;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public ApiCircuit getCircuit() {
        return circuit;
    }

    public void setCircuit(ApiCircuit circuit) {
        this.circuit = circuit;
    }

    public List<ApiRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ApiRoom> rooms) {
        this.rooms = rooms;
    }

    public List<ApiContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ApiContact> contacts) {
        this.contacts = contacts;
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

    public ApiCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(ApiCancellationPolicy cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public ApiItinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(ApiItinerary itinerary) {
        this.itinerary = itinerary;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public ApiCircuitExtraNight getCircuitExtraNight() {
        return circuitExtraNight;
    }

    public void setCircuitExtraNight(ApiCircuitExtraNight circuitExtraNight) {
        this.circuitExtraNight = circuitExtraNight;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }

    public String getUrlWebHook() {
        return urlWebHook;
    }

    public void setUrlWebHook(String urlWebHook) {
        this.urlWebHook = urlWebHook;
    }

    public List<ApiCircuitCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ApiCircuitCategory> categories) {
        this.categories = categories;
    }

    public ApiCircuitCategory getCategory() {
        return category;
    }

    public void setCategory(ApiCircuitCategory category) {
        this.category = category;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }
}
