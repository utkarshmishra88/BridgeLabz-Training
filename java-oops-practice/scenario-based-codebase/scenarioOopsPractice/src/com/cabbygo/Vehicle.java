package com.cabbygo;

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;
    private double fare; // sensitive

    protected double baseFare;
    protected double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity, String type,
                   double baseFare, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }

    public void calculateFare(double distance) {
        fare = baseFare + distance * ratePerKm; // operators used
    }

    public double getFare() {
        return fare;
    }

    public String getVehicleDetails() {
        return type + " [" + vehicleNumber + "], Capacity: " + capacity;
    }
}
