package com.inheritance.vehicle;

public class Truck extends Vehicle {

    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

