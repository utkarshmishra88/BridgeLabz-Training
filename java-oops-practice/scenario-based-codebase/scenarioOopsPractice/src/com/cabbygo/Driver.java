package com.cabbygo;

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getDriverDetails() {
        return name + " | License: " + licenseNumber;
    }
}

