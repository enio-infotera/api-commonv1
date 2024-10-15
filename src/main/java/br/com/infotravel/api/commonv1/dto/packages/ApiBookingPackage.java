/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.packages;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.bus.ApiBookingBus;
import br.com.infotravel.api.commonv1.dto.chip.ApiBookingChip;
import br.com.infotravel.api.commonv1.dto.circuit.ApiBookingCircuit;
import br.com.infotravel.api.commonv1.dto.cruise.ApiBookingCruise;
import br.com.infotravel.api.commonv1.dto.experience.ApiBookingExperience;
import br.com.infotravel.api.commonv1.dto.serviceother.ApiBookingOther;
import br.com.infotravel.api.commonv1.dto.servicepackage.ApiBookingServicePackage;
import br.com.infotravel.api.commonv1.dto.ticket.ApiBookingTicket;
import br.com.infotravel.api.commonv1.dto.tour.ApiBookingTour;
import br.com.infotravel.api.commonv1.dto.transfer.ApiBookingTransfer;
import br.com.infotravel.api.commonv1.dto.insurance.ApiBookingInsurance;
import br.com.infotravel.api.commonv1.dto.hotel.ApiBookingHotel;
import br.com.infotravel.api.commonv1.dto.flight.ApiBookingFlight;
import br.com.infotravel.api.commonv1.dto.vehicle.ApiBookingVehicle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingPackage {

    @JsonProperty("package")
    private ApiPackage apiPackage;

    private List<ApiBookingHotel> bookingHotels;

    private List<ApiBookingFlight> bookingFlights;

    private List<ApiBookingBus> bookingBusList;

    private List<ApiBookingInsurance> bookingInsurances;

    private List<ApiBookingTour> bookingTours;

    private List<ApiBookingServicePackage> bookingServicePackages;

    private List<ApiBookingTicket> bookingTickets;

    private List<ApiBookingTransfer> bookingTransfers;

    private List<ApiBookingOther> bookingServiceOthers;

    private List<ApiBookingExperience> bookingExperiences;

    private List<ApiBookingChip> bookingChips;

    private List<ApiBookingVehicle> bookingVehicles;

    private List<ApiBookingCircuit> bookingCircuits;
    
    private List<ApiBookingCruise> bookingCruises;

    private List<ApiFare> fares;

    public ApiBookingPackage() {
    }

    public ApiPackage getPackage() {
        return apiPackage;
    }

    public ApiBookingPackage(ApiPackage apiPackage) {
        this.apiPackage = apiPackage;
    }

    public void setPackage(ApiPackage apiPackage) {
        this.apiPackage = apiPackage;
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

    public List<ApiBookingBus> getBookingBusList() {
        return bookingBusList;
    }

    public void setBookingBusList(List<ApiBookingBus> bookingBusList) {
        this.bookingBusList = bookingBusList;
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

    public List<ApiBookingVehicle> getBookingVehicles() {
        return bookingVehicles;
    }

    public void setBookingVehicles(List<ApiBookingVehicle> bookingVehicles) {
        this.bookingVehicles = bookingVehicles;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
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

}
