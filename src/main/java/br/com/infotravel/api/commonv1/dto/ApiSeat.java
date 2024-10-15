package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.dto.ApiPosition;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSeat {

    private boolean available;
    private String number;
    private ApiPosition position;

    public ApiSeat() {
    }

    public ApiSeat(boolean available, String number, ApiPosition position) {
        this.available = available;
        this.number = number;
        this.position = position;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ApiPosition getPosition() {
        return position;
    }

    public void setPosition(ApiPosition position) {
        this.position = position;
    }

}
