package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.dto.ApiImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiDeck {

    private String code;
    private String description;
    private List<ApiCabin> cabins;
    private ApiImage image;

    public ApiDeck() {
    }

    public ApiDeck(String code, String description, List<ApiCabin> cabins, ApiImage image) {
        this.code = code;
        this.description = description;
        this.cabins = cabins;
        this.image = image;
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

    public List<ApiCabin> getCabins() {
        return cabins;
    }

    public void setCabins(List<ApiCabin> cabins) {
        this.cabins = cabins;
    }

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }

}
