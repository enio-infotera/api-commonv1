package br.com.infotravel.api.commonv1.dto.cruise;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiDinningOption {

    private String code;
    private String description;

    public ApiDinningOption() {
    }

    public ApiDinningOption(String code, String description) {
        this.code = code;
        this.description = description;
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

}
