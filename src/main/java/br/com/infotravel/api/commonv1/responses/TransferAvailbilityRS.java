/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.transfer.ApiTransferAvail;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferAvailbilityRS {

    @JsonProperty("transferAvail")
    private List<ApiTransferAvail> transferAvails;
    private String message;

    public TransferAvailbilityRS() {
    }

    public TransferAvailbilityRS(List<ApiTransferAvail> transferAvails) {
        this.transferAvails = transferAvails;
    }

    public List<ApiTransferAvail> getTransferAvails() {
        return transferAvails;
    }

    public void setTransferAvails(List<ApiTransferAvail> transferAvails) {
        this.transferAvails = transferAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
