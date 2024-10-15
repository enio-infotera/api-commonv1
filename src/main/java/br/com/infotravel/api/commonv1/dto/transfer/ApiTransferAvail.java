/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.transfer;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiLocation;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.enumerators.TransferType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTransferAvail {

    private ApiLocation origin;
    private ApiLocation destination;

    private TransferType type;
    @JsonSerialize(contentUsing = CustomDateSerializer.class)
    private List<Date> dates;
    private ApiTransfer transfer;
    private List<ApiFare> fares;

    private List<ApiName> names;

    public ApiTransferAvail() {
    }

    public ApiTransferAvail(TransferType type, List<Date> dates, ApiTransfer transfer, List<ApiFare> fares, List<ApiName> names) {
        this.type = type;
        this.dates = dates;
        this.transfer = transfer;
        this.fares = fares;
        this.names = names;
    }

    public ApiLocation getOrigin() {
        return origin;
    }

    public void setOrigin(ApiLocation origin) {
        this.origin = origin;
    }

    public ApiLocation getDestination() {
        return destination;
    }

    public void setDestination(ApiLocation destination) {
        this.destination = destination;
    }

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType type) {
        this.type = type;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public ApiTransfer getTransfer() {
        return transfer;
    }

    public void setTransfer(ApiTransfer transfer) {
        this.transfer = transfer;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

}
