package com.encapsulationandpolymorphism.vehiclesystem;

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    // Sensitive detail (encapsulation)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Encapsulation (Getters & Setters)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    // No getter for policy number → restricted access
    protected boolean hasInsurance() {
        return insurancePolicyNumber != null;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate/Day: ₹" + rentalRate);
    }
}
