package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiImage;
import br.com.infotravel.api.commonv1.dto.ApiName;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCabin {

    private String number;
    private String name;

    private ApiImage image;
    private ApiCabinType cabinType;
    private ApiCabinCategory category;

    private ApiDeck deck;
    private ApiDinningOption dinningOption;

    private List<ApiFare> fares;
    private List<ApiName> names;

    public ApiCabin() {
    }

    public ApiCabin(String number, String name, ApiImage image, ApiCabinType cabinType, ApiCabinCategory category, ApiDeck deck, ApiDinningOption dinningOption, List<ApiFare> fares, List<ApiName> names) {
        this.number = number;
        this.name = name;
        this.image = image;
        this.cabinType = cabinType;
        this.category = category;
        this.deck = deck;
        this.dinningOption = dinningOption;
        this.fares = fares;
        this.names = names;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiImage getImage() {
        return image;
    }

    public void setImage(ApiImage image) {
        this.image = image;
    }

    public ApiCabinType getCabinType() {
        return cabinType;
    }

    public void setCabinType(ApiCabinType cabinType) {
        this.cabinType = cabinType;
    }

    public ApiCabinCategory getCategory() {
        return category;
    }

    public void setCategory(ApiCabinCategory category) {
        this.category = category;
    }

    public ApiDeck getDeck() {
        return deck;
    }

    public void setDeck(ApiDeck deck) {
        this.deck = deck;
    }

    public ApiDinningOption getDinningOption() {
        return dinningOption;
    }

    public void setDinningOption(ApiDinningOption dinningOption) {
        this.dinningOption = dinningOption;
    }

    public List<ApiFare> getFares() {
        return fares;
    }

    public void setFares(List<ApiFare> fares) {
        this.fares = fares;
    }

    public List<ApiName> getNames() {
        return names;
    }

    public void setNames(List<ApiName> names) {
        this.names = names;
    }

}
