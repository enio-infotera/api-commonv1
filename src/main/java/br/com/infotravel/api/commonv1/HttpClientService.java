/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 *
 * @author enioj
 */
public class HttpClientService {

    private final HttpClient httpClient;
    private final String baseUrl;
    private final Gson gson;

    public HttpClientService(String baseUrl) {
        this.httpClient = HttpClient.newHttpClient();
        this.baseUrl = baseUrl;
        this.gson = new Gson();
    }

    public ApiToken authenticate(AuthenticationRQ authenticationRQ) throws IOException, InterruptedException {
        String authUrl = baseUrl + "/authenticate";

        String requestBody = gson.toJson(authenticationRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return gson.fromJson(rs, ApiToken.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    public HotelAvailbilityRS hotelAvailability(HotelAvailabilityRQ authenticationRQ, String accessToken) throws IOException, InterruptedException {
        String authUrl = buildUri(baseUrl + "/avail/hotel", authenticationRQ.getUrlParams());

        String requestBody = gson.toJson(authenticationRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return gson.fromJson(rs, HotelAvailbilityRS.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    public String buildUri(String endpointUrl, Map<String, String> paramsMap) {
        StringBuilder uriBuilder = new StringBuilder(endpointUrl);

        if (paramsMap != null && !paramsMap.isEmpty()) {
            uriBuilder.append("?");

            boolean firstParam = true;
            for (Map.Entry<String, String> uriParams : paramsMap.entrySet()) {
                if (uriParams.getValue() != null) {
                    if (firstParam) {
                        firstParam = false;
                    } else {
                        uriBuilder.append("&");
                    }

                    String encodedKey = encodeValue(uriParams.getKey());
                    String encodedValue = encodeValue(uriParams.getValue());
                    uriBuilder.append(encodedKey).append("=").append(encodedValue);
                }
            }
        }

        return uriBuilder.toString();
    }

    private String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Erro ao codificar valor: " + value, e);
        }
    }
}
