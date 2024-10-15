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
public class UserRegisterRQ {

    private ApiClient user;

    public UserRegisterRQ() {
    }

    public UserRegisterRQ(ApiClient user) {
        this.user = user;
    }

    public ApiClient getUser() {
        return user;
    }

    public void setUser(ApiClient user) {
        this.user = user;
    }
}
