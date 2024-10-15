package br.com.infotravel.api.commonv1.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiInvoice {

    private Integer id;
    private ApiClient person;
    private String description;
    private ApiPrice amount;

    private List<ApiFinancialPosting> financialPostings;

    public ApiInvoice() {
    }

    public ApiInvoice(Integer id, ApiClient person, String description, ApiPrice amount, List<ApiFinancialPosting> financialPostings) {
        this.id = id;
        this.person = person;
        this.description = description;
        this.amount = amount;
        this.financialPostings = financialPostings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ApiClient getPerson() {
        return person;
    }

    public void setPerson(ApiClient person) {
        this.person = person;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiPrice getAmount() {
        return amount;
    }

    public void setAmount(ApiPrice amount) {
        this.amount = amount;
    }

    public List<ApiFinancialPosting> getFinancialPostings() {
        return financialPostings;
    }

    public void setFinancialPostings(List<ApiFinancialPosting> financialPostings) {
        this.financialPostings = financialPostings;
    }
}
