package br.com.infotravel.api.commonv1.requests;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author enioj
 */
public class CircuitAvailabilityRQ {

    private String searchType;// R- regions | C - circuit code
    private String searchCode;
    private boolean allDestiny;
    private String idDestinationList;
    private String date;
    private String occupancy;

    public CircuitAvailabilityRQ() {
    }

    public CircuitAvailabilityRQ(String idDestinationList, String date) {
        this.idDestinationList = idDestinationList;
        this.date = date;
    }

    public CircuitAvailabilityRQ(String searchType, String searchCode, boolean allDestiny, String idDestinationList, String date, String occupancy) {
        this.searchType = searchType;
        this.searchCode = searchCode;
        this.allDestiny = allDestiny;
        this.idDestinationList = idDestinationList;
        this.date = date;
        this.occupancy = occupancy;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public boolean isAllDestiny() {
        return allDestiny;
    }

    public void setAllDestiny(boolean allDestiny) {
        this.allDestiny = allDestiny;
    }

    public String getIdDestinationList() {
        return idDestinationList;
    }

    public void setIdDestinationList(String idDestinationList) {
        this.idDestinationList = idDestinationList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public Map<String, String> getUrlParams() {
        Map<String, String> urlParams = new HashMap<>();

        urlParams.put("date", date);
        urlParams.put("allDestiny", allDestiny ? "true" : "false");

        if (searchType != null) {
            urlParams.put("searchType", searchType);
        }
        if (searchCode != null) {
            urlParams.put("searchCode", searchCode);
        }
        if (idDestinationList != null) {
            urlParams.put("idDestinationList", idDestinationList);
        }
        if (occupancy != null) {
            urlParams.put("occupancy", occupancy);
        }

        return urlParams;
    }
}
