package br.com.infotravel.api.commonv1.dto.cruise;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiItinerary {

    private String code;
    private String name;
    private List<ApiCruiseSegment> segments;

    public ApiItinerary() {
    }

    public ApiItinerary(String code, String name, List<ApiCruiseSegment> segments) {
        this.code = code;
        this.name = name;
        this.segments = segments;
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

    public List<ApiCruiseSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<ApiCruiseSegment> segments) {
        this.segments = segments;
    }

}
