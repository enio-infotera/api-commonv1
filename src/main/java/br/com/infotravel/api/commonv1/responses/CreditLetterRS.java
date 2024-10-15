package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ApiCreditLetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditLetterRS {

    private ApiCreditLetter creditLetter;
    private List<ApiCreditLetter> creditLetterList;

    public CreditLetterRS() {
    }

    public CreditLetterRS(ApiCreditLetter creditLetter) {
        this.creditLetter = creditLetter;
    }

    public CreditLetterRS(List<ApiCreditLetter> creditLetterList) {
        this.creditLetterList = creditLetterList;
    }

    public ApiCreditLetter getCreditLetter() {
        return creditLetter;
    }

    public void setCreditLetter(ApiCreditLetter creditLetter) {
        this.creditLetter = creditLetter;
    }

    public List<ApiCreditLetter> getCreditLetterList() {
        return creditLetterList;
    }

    public void setCreditLetterList(List<ApiCreditLetter> creditLetterList) {
        this.creditLetterList = creditLetterList;
    }

}
