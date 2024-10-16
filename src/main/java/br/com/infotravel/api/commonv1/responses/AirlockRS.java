package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.flight.ApiAirLock;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirlockRS {

    @JsonProperty("airLocks")
    private List<ApiAirLock> apiAirLockList;

    public AirlockRS() {
        this.apiAirLockList = new ArrayList<>();
    }

    public List<ApiAirLock> getApiAirLockList() {
        return apiAirLockList;
    }

    public void setApiAirLockList(List<ApiAirLock> apiAirLockList) {
        this.apiAirLockList = apiAirLockList;
    }
}
