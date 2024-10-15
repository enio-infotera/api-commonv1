/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.payment;

import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiPrice;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPaymentInvoice extends ApiPayment {

    public ApiPaymentInvoice() {
    }

    public ApiPaymentInvoice(String ip, String fingerprint, String description, ApiClient client, ApiPrice value) {
        super(ip, fingerprint, description, client, value);
    }

}
