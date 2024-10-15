package br.com.infotravel.api.commonv1.dto.circuit;

public class ApiItinerary {
    private Integer nights;
    private String description;

    public ApiItinerary() {
    }

    public ApiItinerary(Integer nights, String description) {
        this.nights = nights;
        this.description = description;
    }


    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
