/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ApiCity;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountySearchRS {

    private List<ApiCity> counties;

    public CountySearchRS() {
    }

    public CountySearchRS(List<ApiCity> counties) {
        this.counties = counties;
    }

    public List<ApiCity> getCounties() {
        return counties;
    }

    public void setCounties(List<ApiCity> counties) {
        this.counties = counties;
    }

}
