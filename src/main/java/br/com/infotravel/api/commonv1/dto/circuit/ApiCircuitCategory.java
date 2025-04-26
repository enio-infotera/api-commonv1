package br.com.infotravel.api.commonv1.dto.circuit;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCircuitCategory {

    private String id;
    private String code;
    private String name;
    private String description;
    private List<ApiFare> fares;

    public ApiCircuitCategory() {
    }

    public ApiCircuitCategory(String id, String code, String name, String description, List<ApiFare> fares) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.fares = fares;
    }

    public ApiCircuitCategory(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }
}
