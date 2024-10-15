/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.bus;

import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.dto.flight.ApiRoute;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBusAvail {

    private String provider;
    private List<ApiRoute> routes;
    private List<ApiName> names;

    public ApiBusAvail() {
    }

    public ApiBusAvail(List<ApiRoute> routes, List<ApiName> names) {
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
