package br.com.infotravel.api.commonv1.dto.flight;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBaggage {

    private Integer quantity;
    private Integer weight;

    public ApiBaggage() {
    }

    public ApiBaggage(Integer quantity, Integer weight) {
        this.quantity = quantity;
        this.weight = weight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
