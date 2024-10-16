package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class ApiCircuitExtraNight {
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date minInitialDateAvailable; //menor data que a dtInicio do circuito pode ser alterada

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date maxInitialDateAvailable; //maior data que a dtInicio do circuito pode ser alterada

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date minFinalDateAvailable; //menor data que o dtFim do circuito pode ser alterada

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date maxFinalDateAvailable; //maior data que o dtFim do circuito pode ser alterada

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date initialDate; //data de início escolhida

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate; //data de fim escolhida

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date originalInitialDate; //data de início original do circuito
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date originalFinalDate; //data de fim original do circuito



    public ApiCircuitExtraNight() {
    }

    public ApiCircuitExtraNight(Date minInitialDateAvailable, Date maxInitialDateAvailable, Date minFinalDateAvailable, Date maxFinalDateAvailable, Date initialDate, Date endDate, Date originalInitialDate, Date originalFinalDate) {
        this.minInitialDateAvailable = minInitialDateAvailable;
        this.maxInitialDateAvailable = maxInitialDateAvailable;
        this.minFinalDateAvailable = minFinalDateAvailable;
        this.maxFinalDateAvailable = maxFinalDateAvailable;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.originalInitialDate = originalInitialDate;
        this.originalFinalDate = originalFinalDate;

    }

    public Date getMinInitialDateAvailable() {
        return minInitialDateAvailable;
    }

    public void setMinInitialDateAvailable(Date minInitialDateAvailable) {
        this.minInitialDateAvailable = minInitialDateAvailable;
    }

    public Date getMaxInitialDateAvailable() {
        return maxInitialDateAvailable;
    }

    public void setMaxInitialDateAvailable(Date maxInitialDateAvailable) {
        this.maxInitialDateAvailable = maxInitialDateAvailable;
    }

    public Date getMinFinalDateAvailable() {
        return minFinalDateAvailable;
    }

    public void setMinFinalDateAvailable(Date minFinalDateAvailable) {
        this.minFinalDateAvailable = minFinalDateAvailable;
    }

    public Date getMaxFinalDateAvailable() {
        return maxFinalDateAvailable;
    }

    public void setMaxFinalDateAvailable(Date maxFinalDateAvailable) {
        this.maxFinalDateAvailable = maxFinalDateAvailable;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getOriginalInitialDate() {
        return originalInitialDate;
    }

    public void setOriginalInitialDate(Date originalInitialDate) {
        this.originalInitialDate = originalInitialDate;
    }

    public Date getOriginalFinalDate() {
        return originalFinalDate;
    }

    public void setOriginalFinalDate(Date originalFinalDate) {
        this.originalFinalDate = originalFinalDate;
    }
}
