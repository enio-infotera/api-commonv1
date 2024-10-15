package br.com.infotravel.api.commonv1.requests;

import br.com.infotravel.api.commonv1.dto.ApiCreditLetter;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditLetterRQ {

    private ApiCreditLetter creditLetter;

    public CreditLetterRQ() {
    }

    public ApiCreditLetter getCreditLetter() {
        return creditLetter;
    }

    public void setCreditLetter(ApiCreditLetter creditLetter) {
        this.creditLetter = creditLetter;
    }

}
