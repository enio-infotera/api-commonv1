package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.dto.ApiClient;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCruise {

    private String code;
    private String name;
    private String description;
    private ApiShip ship;

    private ApiPort portDeparture;
    private ApiPort portArrival;

    private ApiItinerary itinerary;
    private ApiClient provider;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date departure;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date arrival;

    private Integer nights;

    private List<ApiImage> images;

    public ApiCruise() {
    }

    public ApiCruise(String code, String name, String description, ApiShip ship, ApiPort portDeparture, ApiPort portArrival, ApiItinerary itinerary, ApiClient provider, Date departure, Date arrival, Integer nights, List<ApiImage> images) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.ship = ship;
        this.portDeparture = portDeparture;
        this.portArrival = portArrival;
        this.itinerary = itinerary;
        this.provider = provider;
        this.departure = departure;
        this.arrival = arrival;
        this.nights = nights;
        this.images = images;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiShip getShip() {
        return ship;
    }

    public void setShip(ApiShip ship) {
        this.ship = ship;
    }

    public ApiPort getPortDeparture() {
        return portDeparture;
    }

    public void setPortDeparture(ApiPort portDeparture) {
        this.portDeparture = portDeparture;
    }

    public ApiPort getPortArrival() {
        return portArrival;
    }

    public void setPortArrival(ApiPort portArrival) {
        this.portArrival = portArrival;
    }

    public ApiItinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(ApiItinerary itinerary) {
        this.itinerary = itinerary;
    }

    public ApiClient getProvider() {
        return provider;
    }

    public void setProvider(ApiClient provider) {
        this.provider = provider;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public List<ApiImage> getImages() {
        return images;
    }

    public void setImages(List<ApiImage> images) {
        this.images = images;
    }

}
