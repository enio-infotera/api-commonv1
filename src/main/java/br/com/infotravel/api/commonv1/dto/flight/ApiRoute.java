package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.dto.bus.ApiBus;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRoute {

    private Integer numberRoute;
    private List<ApiFlight> flights;
    private List<ApiBus> busList;

    public ApiRoute(Integer numberRoute, List<ApiFlight> flights, List<ApiBus> busList) {
        this.numberRoute = numberRoute;
        this.flights = flights;
        this.busList = busList;
    }

    public Integer getNumberRoute() {
        return numberRoute;
    }

    public void setNumberRoute(Integer numberRoute) {
        this.numberRoute = numberRoute;
    }

    public List<ApiFlight> getFlights() {
        return flights;
    }

    public void setFlights(List<ApiFlight> flights) {
        this.flights = flights;
    }

    public List<ApiBus> getBusList() {
        return busList;
    }

    public void setBusList(List<ApiBus> busList) {
        this.busList = busList;
    }

}
