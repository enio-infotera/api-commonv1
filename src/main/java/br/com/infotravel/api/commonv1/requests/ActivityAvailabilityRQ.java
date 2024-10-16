package br.com.infotravel.api.commonv1.requests;

import java.util.HashMap;
import java.util.Map;

public class ActivityAvailabilityRQ {


    private String start;
    private String end;
    private String occupancy;
    private String destination;
    private String destinationType;
    private Integer activity;
    private Integer packageId;
    private  String coupon;
    private Integer client;
    private String provider;
    private String bookingType;


    public ActivityAvailabilityRQ(String start, String end, String occupancy, String destination) {
        this.start = start;
        this.end = end;
        this.occupancy = occupancy;
        this.destination = destination;
    }

    public ActivityAvailabilityRQ() {
    }

    public ActivityAvailabilityRQ(String start, String end, String occupancy, String destination, String destinationType, Integer activity, Integer packageId, String coupon, Integer client, String provider, String bookingType) {
        this.start = start;
        this.end = end;
        this.occupancy = occupancy;
        this.destination = destination;
        this.destinationType = destinationType;
        this.activity = activity;
        this.packageId = packageId;
        this.coupon = coupon;
        this.client = client;
        this.provider = provider;
        this.bookingType = bookingType;
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

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }


    public Map<String, String> getUrlParams() {
        Map<String, String> urlParams = new HashMap<>();

        if (start != null) {
            urlParams.put("start", start);
        }

        if (end != null) {
            urlParams.put("end", end);
        }

        if (occupancy != null) {
            urlParams.put("occupancy", occupancy);
        }
        if (destination != null) {
            urlParams.put("destination", destination);
        }
        if (destinationType != null) {
            urlParams.put("destinationType", destinationType);
        }

        if (activity != null) {
            urlParams.put("activity", activity.toString());
        }

        if(coupon != null) {
            urlParams.put("coupon", coupon);
        }

        if (client != null) {
            urlParams.put("client", client.toString());
        }

        if (provider != null) {
            urlParams.put("provider", provider);
        }


        if (bookingType != null) {
            urlParams.put("bookingType", bookingType);
        }

        return urlParams;
    }
}
