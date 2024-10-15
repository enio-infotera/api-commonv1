package br.com.infotravel.api.commonv1.responses;


import br.com.infotravel.api.commonv1.dto.ApiCashRegister;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CashRegisterRS{

    private List<ApiCashRegister> cashRegisterList;

    public CashRegisterRS(List<ApiCashRegister> cashRegisterList) {
        this.cashRegisterList = cashRegisterList;
    }

    public List<ApiCashRegister> getCashRegisterList() {
        return cashRegisterList;
    }

    public void setCashRegisterList(List<ApiCashRegister> cashRegisterList) {
        this.cashRegisterList = cashRegisterList;
    }
}
