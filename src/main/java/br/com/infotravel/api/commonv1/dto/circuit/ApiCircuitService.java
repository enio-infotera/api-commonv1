package br.com.infotravel.api.commonv1.dto.circuit;


import br.com.infotravel.api.commonv1.enumerators.TourServiceType;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCircuitService {
    private String name;
    private String description;

    private TourServiceType type;

    public ApiCircuitService() {
    }

    public ApiCircuitService(String name, String description, TourServiceType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TourServiceType getType() {
        return type;
    }

    public void setType(TourServiceType type) {
        this.type = type;
    }
}
