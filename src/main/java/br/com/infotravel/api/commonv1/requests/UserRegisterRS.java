/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.requests;

import br.com.infotravel.api.commonv1.dto.ApiClient;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegisterRS {

    public boolean isSuccess;
    public ApiClient user;

    public UserRegisterRS() {
    }

    public UserRegisterRS(boolean isSuccess, ApiClient user) {
        this.isSuccess = isSuccess;
        this.user = user;
    }

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ApiClient getUser() {
        return user;
    }

    public void setUser(ApiClient user) {
        this.user = user;
    }
}
