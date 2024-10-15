package br.com.infotravel.api.commonv1.dto.flight;

import br.com.infotravel.api.commonv1.dto.ApiFare;

import java.util.List;

public class ApiFareFlight {
    private String key;
    private String code;
    private String description;
    private List<ApiFare> fares;

    private String operatorCode;

    private List<ApiFlightClassBaggage> apiFlightClassBaggages;

    private boolean operator;


    public ApiFareFlight() {
    }


    public ApiFareFlight(String key, String code, String description, List<ApiFare> fares , boolean operator) {
        this.key = key;
        this.code = code;
        this.description = description;
        this.fares = fares;
        this.operator = operator;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<ApiFlightClassBaggage> getApiFlightClassBaggages() {
        return apiFlightClassBaggages;
    }

    public void setApiFlightClassBaggages(List<ApiFlightClassBaggage> apiFlightClassBaggages) {
        this.apiFlightClassBaggages = apiFlightClassBaggages;
    }

    public boolean isOperator() {
        return operator;
    }

    public void setOperator(boolean operator) {
        this.operator = operator;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
}
