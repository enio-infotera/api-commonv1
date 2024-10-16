/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import java.io.IOException;

/**
 *
 * @author enioj
 */
public class Teste {

    public static void main(String[] args) {
        String baseUrl = "https://visualturismo.infotravel.com.br/infotravel/api/v1";
        HttpClientService httpClientService = new HttpClientService(baseUrl);

        try {

            AuthenticationRQ authenticationRQ = new AuthenticationRQ("visualtestws", "61FCbA@_lIi1", "2", "VISUAL", "pt_br");

            ApiToken token = httpClientService.authenticate(authenticationRQ);
            System.out.println("Token obtido: " + token.getAccessToken());

            HotelAvailabilityRQ availabilityDestinationRQ = new HotelAvailabilityRQ("2024-11-10", "2024-11-20", "2", "2705", null);
            HotelAvailbilityRS hotelAvailbilityRS = httpClientService.hotelAvailability(availabilityDestinationRQ, token.getAccessToken());

            System.out.println(hotelAvailbilityRS);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
