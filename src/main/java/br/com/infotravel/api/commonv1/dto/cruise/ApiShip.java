package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.dto.ApiImage;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiShip {

    private String code;
    private String name;
    private String description;
    private ApiImage image;

    public ApiShip() {
    }

    public ApiShip(String code, String name, String description, ApiImage image) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
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

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }

}
