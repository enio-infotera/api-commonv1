/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto.hotel;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRoomGroup {

    private List<ApiRoom> rooms;

    public ApiRoomGroup() {
    }

    public ApiRoomGroup(List<ApiRoom> rooms) {
        this.rooms = rooms;
    }

    public List<ApiRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ApiRoom> rooms) {
        this.rooms = rooms;
    }

}
