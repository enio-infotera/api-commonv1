/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.packages;

import br.com.infotravel.api.commonv1.dto.bus.ApiBusAvail;
import br.com.infotravel.api.commonv1.dto.serviceother.ApiServiceOtherAvail;
import br.com.infotravel.api.commonv1.dto.servicepackage.ApiServicePackageAvail;
import br.com.infotravel.api.commonv1.dto.ticket.ApiTicketAvail;
import br.com.infotravel.api.commonv1.dto.tour.ApiTourAvail;
import br.com.infotravel.api.commonv1.dto.transfer.ApiTransferAvail;
import br.com.infotravel.api.commonv1.dto.insurance.ApiInsuranceAvail;
import br.com.infotravel.api.commonv1.dto.hotel.ApiHotelAvail;
import br.com.infotravel.api.commonv1.dto.flight.ApiFlightAvail;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPackageAvail {

    @SerializedName("package")
    private ApiPackage apiPackage;

    
    private List<ApiHotelAvail> hotelAvails;
    
    private List<ApiFlightAvail> flightAvails;
    
    private List<ApiBusAvail> busAvails;

    
    private List<ApiTicketAvail> ticketAvails;
    
    private List<ApiServicePackageAvail> servicePackageAvails;
    
    private List<ApiTourAvail> tourAvails;
    
    private List<ApiInsuranceAvail> insuranceAvails;
    
    private List<ApiTransferAvail> transferAvails;
    
    private List<ApiServiceOtherAvail> serviceOtherAvails;

    public ApiPackageAvail() {
    }

    public ApiPackageAvail(ApiPackage apiPackage) {
        this.apiPackage = apiPackage;
    }

    public ApiPackage getApiPackage() {
        return apiPackage;
    }

    public void setApiPackage(ApiPackage apiPackage) {
        this.apiPackage = apiPackage;
    }

    public List<ApiHotelAvail> getHotelAvails() {
        return hotelAvails;
    }

    public void setHotelAvails(List<ApiHotelAvail> hotelAvails) {
        this.hotelAvails = hotelAvails;
    }

    public List<ApiFlightAvail> getFlightAvails() {
        return flightAvails;
    }

    public void setFlightAvails(List<ApiFlightAvail> flightAvails) {
        this.flightAvails = flightAvails;
    }

    public List<ApiBusAvail> getBusAvails() {
        return busAvails;
    }

    public void setBusAvails(List<ApiBusAvail> busAvails) {
        this.busAvails = busAvails;
    }

    public List<ApiTicketAvail> getTicketAvails() {
        return ticketAvails;
    }

    public void setTicketAvails(List<ApiTicketAvail> ticketAvails) {
        this.ticketAvails = ticketAvails;
    }

    public List<ApiServicePackageAvail> getServicePackageAvails() {
        return servicePackageAvails;
    }

    public void setServicePackageAvails(List<ApiServicePackageAvail> servicePackageAvails) {
        this.servicePackageAvails = servicePackageAvails;
    }

    public List<ApiTourAvail> getTourAvails() {
        return tourAvails;
    }

    public void setTourAvails(List<ApiTourAvail> tourAvails) {
        this.tourAvails = tourAvails;
    }

    public List<ApiInsuranceAvail> getInsuranceAvails() {
        return insuranceAvails;
    }

    public void setInsuranceAvails(List<ApiInsuranceAvail> insuranceAvails) {
        this.insuranceAvails = insuranceAvails;
    }

    public List<ApiTransferAvail> getTransferAvails() {
        return transferAvails;
    }

    public void setTransferAvails(List<ApiTransferAvail> transferAvails) {
        this.transferAvails = transferAvails;
    }

    public List<ApiServiceOtherAvail> getServiceOtherAvails() {
        return serviceOtherAvails;
    }

    public void setServiceOtherAvails(List<ApiServiceOtherAvail> serviceOtherAvails) {
        this.serviceOtherAvails = serviceOtherAvails;
    }

}
