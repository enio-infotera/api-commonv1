package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.dto.ApiName;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiFlightAvail {


    private String provider;

    private List<ApiRoute> routes;

    private List<ApiName> names;

    public ApiFlightAvail() {
    }

    public ApiFlightAvail(List<ApiRoute> routes, List<ApiName> names) {
        this.routes = routes;
        this.names = names;
    }


    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<ApiRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<ApiRoute> routes) {
        this.routes = routes;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

}
