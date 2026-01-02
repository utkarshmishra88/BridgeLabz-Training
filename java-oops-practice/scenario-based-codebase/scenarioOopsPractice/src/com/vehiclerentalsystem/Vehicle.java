package com.vehiclerentalsystem;

abstract class Vehicle implements Rentable {
    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public void getDetails() {
        System.out.println(vehicleId + " " + brand + " Rate/day: " + baseRate);
    }
}

