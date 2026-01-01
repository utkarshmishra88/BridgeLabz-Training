package com.encapsulationandpolymorphism.ridehailing;

abstract class Vehicle implements GPS {

    // Encapsulated fields
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : ₹" + ratePerKm);
    }

    // Protected access for subclasses
    protected double getRatePerKm() {
        return ratePerKm;
    }

    // GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

