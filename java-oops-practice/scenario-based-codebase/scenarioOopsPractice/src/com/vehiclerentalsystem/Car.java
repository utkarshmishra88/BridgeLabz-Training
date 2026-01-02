package com.vehiclerentalsystem;

class Car extends Vehicle {
    Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 500; // luxury charges
    }
}

