/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1.requests;

import br.com.infotravel.api.commonv1.utils.Utils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author enioj
 */
public class HotelAvailabilityRQ {

    private String start;
    private String end;
    private String occupancy;
    private String destination;
    private String hotel;

    public HotelAvailabilityRQ() {
    }

    public HotelAvailabilityRQ(String start, String end, String occupancy, String destination, String hotel) {
        this.start = start;
        this.end = end;
        this.occupancy = occupancy;
        this.destination = destination;
        this.hotel = hotel;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Map<String, String> getUrlParams() {
        Map<String, String> urlParams = new HashMap<>();

        urlParams.put("start", start);
        urlParams.put("end", end);
        urlParams.put("occupancy", occupancy);
        urlParams.put("destination", destination);

        if (hotel != null) {
            urlParams.put("hotel", hotel);
        }

        return urlParams;
    }
}
