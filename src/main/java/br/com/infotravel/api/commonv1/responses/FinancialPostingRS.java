package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ApiFinancialPosting;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialPostingRS {

    private List<ApiFinancialPosting> financialPostings;

    public FinancialPostingRS() {
    }

    public FinancialPostingRS(List<ApiFinancialPosting> financialPostings) {
        this.financialPostings = financialPostings;
    }

    public List<ApiFinancialPosting> getFinancialPostings() {
        return financialPostings;
    }

    public void setFinancialPostings(List<ApiFinancialPosting> financialPostings) {
        this.financialPostings = financialPostings;
    }
}
