package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCircuitDay {

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date start;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date end;
    private ApiCircuitCategory category;
    private List<ApiFare> fares;
    private boolean stAvailable;

    public ApiCircuitDay() {
    }

    public ApiCircuitDay(Date start, Date end, ApiCircuitCategory category, List<ApiFare> fares, boolean stAvailable) {
        this.start = start;
        this.end = end;
        this.category = category;
        this.fares = fares;
        this.stAvailable = stAvailable;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public boolean isStAvailable() {
        return stAvailable;
    }

    public void setStAvailable(boolean stAvailable) {
        this.stAvailable = stAvailable;
    }

    public ApiCircuitCategory getCategory() {
        return category;
    }

    public void setCategory(ApiCircuitCategory category) {
        this.category = category;
    }
}
