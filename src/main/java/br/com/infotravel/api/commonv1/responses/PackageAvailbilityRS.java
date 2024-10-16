/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.packages.ApiPackageAvail;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackageAvailbilityRS {

    @SerializedName("packageAvails")
    private List<ApiPackageAvail> packageAvails;
    private String message;

    public PackageAvailbilityRS() {
    }

    public PackageAvailbilityRS(List<ApiPackageAvail> packageAvails) {
        this.packageAvails = packageAvails;
    }

    public List<ApiPackageAvail> getPackageAvails() {
        return packageAvails;
    }

    public void setPackageAvails(List<ApiPackageAvail> packageAvails) {
        this.packageAvails = packageAvails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
