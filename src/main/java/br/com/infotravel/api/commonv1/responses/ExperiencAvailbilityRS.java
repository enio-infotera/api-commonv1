
package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.experience.ApiExperienceAvail;
import br.com.infotravel.api.commonv1.dto.tour.ApiTourAvail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExperiencAvailbilityRS {

    @SerializedName("experienceAvail")
    private List<ApiExperienceAvail> experienceAvailList;
    private String message;

    public ExperiencAvailbilityRS(List<ApiExperienceAvail> experienceAvailList, String message) {
        this.experienceAvailList = experienceAvailList;
        this.message = message;
    }

    public ExperiencAvailbilityRS() {
    }

    public List<ApiExperienceAvail> getExperienceAvailList() {
        return experienceAvailList;
    }

    public void setExperienceAvailList(List<ApiExperienceAvail> experienceAvailList) {
        this.experienceAvailList = experienceAvailList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
