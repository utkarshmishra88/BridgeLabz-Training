package com.travellog;
import java.io.Serializable;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;

    private String city;
    private String country;
    private int durationDays;
    private String travelNotes;

    public Trip(String city, String country, int durationDays, String travelNotes) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.travelNotes = travelNotes;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public String getTravelNotes() {
        return travelNotes;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + durationDays + " days)";
    }
}
