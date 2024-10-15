/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.dto.bus.ApiBookingBus;
import br.com.infotravel.api.commonv1.dto.chip.ApiBookingChip;
import br.com.infotravel.api.commonv1.dto.circuit.ApiBookingCircuit;
import br.com.infotravel.api.commonv1.dto.cruise.ApiBookingCruise;
import br.com.infotravel.api.commonv1.dto.experience.ApiBookingExperience;
import br.com.infotravel.api.commonv1.dto.flight.ApiBookingFlight;
import br.com.infotravel.api.commonv1.dto.hotel.ApiBookingHotel;
import br.com.infotravel.api.commonv1.dto.insurance.ApiBookingInsurance;
import br.com.infotravel.api.commonv1.dto.packages.ApiBookingPackage;
import br.com.infotravel.api.commonv1.dto.payment.ApiPayment;
import br.com.infotravel.api.commonv1.dto.serviceother.ApiBookingOther;
import br.com.infotravel.api.commonv1.dto.servicepackage.ApiBookingServicePackage;
import br.com.infotravel.api.commonv1.dto.ticket.ApiBookingTicket;
import br.com.infotravel.api.commonv1.dto.tour.ApiBookingTour;
import br.com.infotravel.api.commonv1.dto.transfer.ApiBookingTransfer;
import br.com.infotravel.api.commonv1.dto.vehicle.ApiBookingVehicle;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import br.com.infotravel.api.commonv1.enumerators.BookingType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBooking {

    private Integer id;

    private Integer bannerId;

    private Integer clientId;

    private BookingStatus status;

    private BookingType type;

    private ApiContact contact;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createdAt;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date expirationDate;
    private Boolean virtual;
    private boolean logged;
    private String coupon;
    private String urlVoucher;
    private String observationApi;
    private String callBack;
    private String cancellationReason;
    private ApiPrice bookingAmount;

    private ApiCompany company;
    private ApiClient client;
    private ApiClient unit;
    private ApiClient user;

    private List<ApiBookingHotel> bookingHotels;
    private List<ApiBookingFlight> bookingFlights;
    private List<ApiBookingInsurance> bookingInsurances;
    private List<ApiBookingTour> bookingTours;
    private List<ApiBookingServicePackage> bookingServicePackages;
    private List<ApiBookingTicket> bookingTickets;
    private List<ApiBookingTransfer> bookingTransfers;
    private List<ApiBookingOther> bookingServiceOthers;
    private List<ApiBookingPackage> bookingPackages;
    private List<ApiBookingVehicle> bookingVehicles;
    private List<ApiBookingExperience> bookingExperiences;

    private List<ApiBookingChip> bookingChips;
    private List<ApiBookingCircuit> bookingCircuits;
    private List<ApiBookingCruise> bookingCruises;
    private List<ApiBookingBus> bookingBuses;

    private List<ApiPayment> payments;
    private List<ApiCoupon> coupons;

    private List<ApiAttachment> attachments;

    private String textDoc;

    public ApiBooking() {
    }

    public List<ApiBookingHotel> getBookingHotels() {
        return bookingHotels;
    }

    public void setBookingHotels(List<ApiBookingHotel> bookingHotels) {
        this.bookingHotels = bookingHotels;
    }

    public List<ApiBookingFlight> getBookingFlights() {
        return bookingFlights;
    }

    public void setBookingFlights(List<ApiBookingFlight> bookingFlights) {
        this.bookingFlights = bookingFlights;
    }

    public List<ApiBookingInsurance> getBookingInsurances() {
        return bookingInsurances;
    }

    public void setBookingInsurances(List<ApiBookingInsurance> bookingInsurances) {
        this.bookingInsurances = bookingInsurances;
    }

    public List<ApiBookingTour> getBookingTours() {
        return bookingTours;
    }

    public void setBookingTours(List<ApiBookingTour> bookingTours) {
        this.bookingTours = bookingTours;
    }

    public List<ApiBookingServicePackage> getBookingServicePackages() {
        return bookingServicePackages;
    }

    public void setBookingServicePackages(List<ApiBookingServicePackage> bookingServicePackages) {
        this.bookingServicePackages = bookingServicePackages;
    }

    public List<ApiBookingTicket> getBookingTickets() {
        return bookingTickets;
    }

    public void setBookingTickets(List<ApiBookingTicket> bookingTickets) {
        this.bookingTickets = bookingTickets;
    }

    public List<ApiBookingTransfer> getBookingTransfers() {
        return bookingTransfers;
    }

    public void setBookingTransfers(List<ApiBookingTransfer> bookingTransfers) {
        this.bookingTransfers = bookingTransfers;
    }

    public List<ApiBookingOther> getBookingServiceOthers() {
        return bookingServiceOthers;
    }

    public void setBookingServiceOthers(List<ApiBookingOther> bookingServiceOthers) {
        this.bookingServiceOthers = bookingServiceOthers;
    }

    public ApiContact getContact() {
        return contact;
    }

    public void setContact(ApiContact contact) {
        this.contact = contact;
    }

    public List<ApiPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<ApiPayment> payments) {
        this.payments = payments;
    }

    public List<ApiCoupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<ApiCoupon> coupons) {
        this.coupons = coupons;
    }

    public List<ApiAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<ApiAttachment> attachments) {
        this.attachments = attachments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public BookingType getType() {
        return type;
    }

    public void setType(BookingType type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<ApiBookingPackage> getBookingPackages() {
        return bookingPackages;
    }

    public void setBookingPackages(List<ApiBookingPackage> bookingPackages) {
        this.bookingPackages = bookingPackages;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getUrlVoucher() {
        return urlVoucher;
    }

    public void setUrlVoucher(String urlVoucher) {
        this.urlVoucher = urlVoucher;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public ApiPrice getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(ApiPrice bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public ApiCompany getCompany() {
        return company;
    }

    public void setCompany(ApiCompany company) {
        this.company = company;
    }

    public ApiClient getClient() {
        return client;
    }

    public void setClient(ApiClient client) {
        this.client = client;
    }

    public ApiClient getUnit() {
        return unit;
    }

    public void setUnit(ApiClient unit) {
        this.unit = unit;
    }

    public List<ApiBookingVehicle> getBookingVehicles() {
        return bookingVehicles;
    }

    public void setBookingVehicles(List<ApiBookingVehicle> bookingVehicles) {
        this.bookingVehicles = bookingVehicles;
    }

    public List<ApiBookingExperience> getBookingExperiences() {
        return bookingExperiences;
    }

    public void setBookingExperiences(List<ApiBookingExperience> bookingExperiences) {
        this.bookingExperiences = bookingExperiences;
    }

    public List<ApiBookingChip> getBookingChips() {
        return bookingChips;
    }

    public void setBookingChips(List<ApiBookingChip> bookingChips) {
        this.bookingChips = bookingChips;
    }

    public List<ApiBookingCircuit> getBookingCircuits() {
        return bookingCircuits;
    }

    public void setBookingCircuits(List<ApiBookingCircuit> bookingCircuits) {
        this.bookingCircuits = bookingCircuits;
    }

    public List<ApiBookingCruise> getBookingCruises() {
        return bookingCruises;
    }

    public void setBookingCruises(List<ApiBookingCruise> bookingCruises) {
        this.bookingCruises = bookingCruises;
    }

    public List<ApiBookingBus> getBookingBuses() {
        return bookingBuses;
    }

    public void setBookingBuses(List<ApiBookingBus> bookingBuses) {
        this.bookingBuses = bookingBuses;
    }

    public ApiClient getUser() {
        return user;
    }

    public void setUser(ApiClient user) {
        this.user = user;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }

    public String getObservationApi() {
        return observationApi;
    }

    public void setObservationApi(String observationApi) {
        this.observationApi = observationApi;
    }
}
