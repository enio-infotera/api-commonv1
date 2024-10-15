package br.com.infotravel.api.commonv1.dto.experience;

import br.com.infotravel.api.commonv1.dto.ApiFare;
import br.com.infotravel.api.commonv1.dto.ApiName;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiExperienceAvail {

    private ApiExperience experience;
     @JsonSerialize(contentUsing = CustomDateNoHourSerializer.class)
    @JsonDeserialize(contentUsing = CustomDateNoHourDeserializer.class)
    private List<Date> dates;
    private List<ApiFare> fares;

    private List<ApiName> names;

    public ApiExperienceAvail() {
    }

    public ApiExperienceAvail(ApiExperience experience, List<Date> dates, List<ApiFare> fares, List<ApiName> names) {
        this.experience = experience;
        this.dates = dates;
        this.fares = fares;
        this.names = names;
    }

    public ApiExperience getExperience() {
        return experience;
    }

    public void setExperience(ApiExperience experience) {
        this.experience = experience;
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

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

}
