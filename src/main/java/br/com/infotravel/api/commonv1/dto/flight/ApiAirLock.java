package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAirLock {

    private Integer id;

    private String code;

    private Integer availableQuantity;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date deadLine;

    private ApiFlight outboundFlight;

    private ApiFlight inboundFlight;

    public ApiAirLock() {
    }

    public ApiAirLock(Integer id, String code, Integer availableQuantity, Date deadLine, ApiFlight outboundFlight, ApiFlight inboundFlight) {
        this.id = id;
        this.code = code;
        this.availableQuantity = availableQuantity;
        this.deadLine = deadLine;
        this.outboundFlight = outboundFlight;
        this.inboundFlight = inboundFlight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public ApiFlight getOutboundFlight() {
        return outboundFlight;
    }

    public void setOutboundFlight(ApiFlight outboundFlight) {
        this.outboundFlight = outboundFlight;
    }

    public ApiFlight getInboundFlight() {
        return inboundFlight;
    }

    public void setInboundFlight(ApiFlight inboundFlight) {
        this.inboundFlight = inboundFlight;
    }
}
