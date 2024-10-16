package br.com.infotravel.api.commonv1.client;

import br.com.infotravel.api.commonv1.dto.ApiToken;
import br.com.infotravel.api.commonv1.exceptions.ApiError;
import br.com.infotravel.api.commonv1.exceptions.ApiException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author enioj
 */
public class InfotravelHttpClient {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public InfotravelHttpClient() {
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public <T> T sendRequest(String url, Object requestBody, Class<T> responseType, String method, ApiToken token) throws ApiException {
        try {
            System.out.println("--------------------------------------------");
            System.out.println("Endpoint: [" + method + "]: " + url);

            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json");

            if (token != null) {
                System.out.println("Authorization: " + token.getAccessToken());
                requestBuilder.header("Authorization", "Bearer " + token.getAccessToken());
            }

            if ("POST".equalsIgnoreCase(method)) {
                String body = convertToJson(requestBody);

                System.out.println("Request body: " + body);
                requestBuilder.POST(HttpRequest.BodyPublishers.ofString(body));
            } else {
                requestBuilder.GET();
            }

            HttpResponse<String> response = httpClient.send(requestBuilder.build(), HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String responseBody = response.body();

                System.out.println("Success Response body: " + responseBody);
                System.out.println("--------------------------------------------");

                // Verifica se o corpo da resposta está vazio
                if (responseBody == null || responseBody.isEmpty()) {
                    return null;
                }
                return convertFromJson(response.body(), responseType);
            } else {
                throw parseApiException(response);
            }
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ApiException(500, "Internal Client Error", e.getMessage(), "INTERNAL_ERROR", e);
        }
    }

    private ApiException parseApiException(HttpResponse<String> response) {
        try {
            String responseBody = response.body();
            System.out.println("Error Response body: " + responseBody);
            System.out.println("--------------------------------------------");

            ApiError apiError = objectMapper.readValue(response.body(), ApiError.class);
            return new ApiException(
                    response.statusCode(),
                    apiError.getMessage(),
                    apiError.getDescription(),
                    apiError.getCode()
            );
        } catch (JsonProcessingException e) {
            throw new ApiException(
                    response.statusCode(),
                    "Failed to parse API error response",
                    response.body(),
                    "PARSE_ERROR",
                    e
            );
        }
    }

    private String convertToJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    private <T> T convertFromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to object", e);
        }
    }

    public String buildUri(String endpointUrl, Map<String, String> params) {
        StringBuilder uriBuilder = new StringBuilder(endpointUrl);
        if (params != null && !params.isEmpty()) {
            uriBuilder.append("?");
            params.forEach((key, value) -> {
                if (value != null) {
                    uriBuilder.append(encodeValue(key))
                            .append("=")
                            .append(encodeValue(value))
                            .append("&");
                }
            });
            uriBuilder.setLength(uriBuilder.length() - 1); // Remove last '&'
        }
        return uriBuilder.toString();
    }

    private String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Error encoding value: " + value, e);
        }
    }
}
