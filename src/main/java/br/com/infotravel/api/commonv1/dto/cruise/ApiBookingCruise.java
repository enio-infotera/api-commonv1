package br.com.infotravel.api.commonv1.dto.cruise;

import br.com.infotravel.api.commonv1.dto.ApiLocator;
import br.com.infotravel.api.commonv1.enumerators.BookingStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBookingCruise {

    private BookingStatus status;
    private List<ApiLocator> locators;
    private String provider;
    
    private ApiCruise cruise;
    private List<ApiCabin> cabins;


    private String textDoc;

    public ApiBookingCruise() {
    }

    public ApiBookingCruise(BookingStatus status, List<ApiLocator> locators, String provider, ApiCruise cruise, List<ApiCabin> cabins) {
        this.status = status;
        this.locators = locators;
        this.provider = provider;
        this.cruise = cruise;
        this.cabins = cabins;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public List<ApiLocator> getLocators() {
        return locators;
    }

    public void setLocators(List<ApiLocator> locators) {
        this.locators = locators;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ApiCruise getCruise() {
        return cruise;
    }

    public void setCruise(ApiCruise cruise) {
        this.cruise = cruise;
    }

    public List<ApiCabin> getCabins() {
        return cabins;
    }

    public void setCabins(List<ApiCabin> cabins) {
        this.cabins = cabins;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }
}
