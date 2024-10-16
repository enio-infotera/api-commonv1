/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1;

import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.requests.ActivityAvailabilityRQ;
import br.com.infotravel.api.commonv1.requests.AuthenticationRQ;
import br.com.infotravel.api.commonv1.requests.BookingRQ;
import br.com.infotravel.api.commonv1.requests.HotelAvailabilityRQ;
import br.com.infotravel.api.commonv1.responses.BookingRS;
import br.com.infotravel.api.commonv1.responses.HotelAvailbilityRS;
import br.com.infotravel.api.commonv1.responses.TourAvailbilityRS;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author enioj
 */
public class HttpClientService {

    private final HttpClient httpClient;
    private final String baseUrl;
    private final JsonMapper jsonMapper;

    public HttpClientService(String baseUrl) {
        this.httpClient = HttpClient.newHttpClient();
        this.baseUrl = baseUrl;
        this.jsonMapper = new JsonMapper();
    }

    public ApiToken authenticate(AuthenticationRQ authenticationRQ) throws IOException, InterruptedException {
        String authUrl = baseUrl + "/authenticate";

        String requestBody = convertToJson(authenticationRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return convertFromJson(rs, ApiToken.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    public HotelAvailbilityRS hotelAvailability(HotelAvailabilityRQ authenticationRQ, String accessToken) throws IOException, InterruptedException {
        String authUrl = buildUri(baseUrl + "/avail/hotel", authenticationRQ.getUrlParams());

        String requestBody = convertToJson(authenticationRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return convertFromJson(rs, HotelAvailbilityRS.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }


    /**
     *
     */
    public TourAvailbilityRS tourAvail(ActivityAvailabilityRQ availabilityRQ, String accessToken) throws IOException, InterruptedException {
        String authUrl = buildUri(baseUrl + "/avail/activity", availabilityRQ.getUrlParams());

        String requestBody = convertToJson(availabilityRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .GET()
                .build();

        System.out.println(authUrl);
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode() == 200) {
            String rs = response.body();
            return convertFromJson(rs, TourAvailbilityRS.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    public BookingRS checkRates(BookingRQ bookingRQ, String accessToken) throws IOException, InterruptedException {
        String authUrl = baseUrl + "/checkrate";

        String requestBody = convertToJson(bookingRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .POST(BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return convertFromJson(rs, BookingRS.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    public BookingRS booking(BookingRQ bookingRQ, String accessToken) throws IOException, InterruptedException {
        String authUrl = baseUrl + "/booking";

        String requestBody = convertToJson(bookingRQ);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .POST(BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String rs = response.body();
            return convertFromJson(rs, BookingRS.class);
        } else {
            throw new RuntimeException("Authentication failed: " + response.body());
        }
    }

    private String convertToJson(Object object) {
        try {
            return jsonMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    private <T> T convertFromJson(String json, Class<T> clazz) {
        try {
            return jsonMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to object", e);
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
