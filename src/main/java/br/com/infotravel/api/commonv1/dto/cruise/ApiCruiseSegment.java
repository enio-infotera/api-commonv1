package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.enumerators.ShipActivityType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCruiseSegment {

    private Integer number;
    private ApiPort port;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date departure;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date arrival;
    private ShipActivityType shipActivityType;

    public ApiCruiseSegment() {
    }

    public ApiCruiseSegment(Integer number, ApiPort port, Date departure, Date arrival, ShipActivityType shipActivityType) {
        this.number = number;
        this.port = port;
        this.departure = departure;
        this.arrival = arrival;
        this.shipActivityType = shipActivityType;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ApiPort getPort() {
        return port;
    }

    public void setPort(ApiPort port) {
        this.port = port;
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

    public ShipActivityType getShipActivityType() {
        return shipActivityType;
    }

    public void setShipActivityType(ShipActivityType shipActivityType) {
        this.shipActivityType = shipActivityType;
    }

}
