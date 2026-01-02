package com.vehiclerentalsystem;

class Truck extends Vehicle {
    Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + (days * 1000); // load surcharge
    }
}
