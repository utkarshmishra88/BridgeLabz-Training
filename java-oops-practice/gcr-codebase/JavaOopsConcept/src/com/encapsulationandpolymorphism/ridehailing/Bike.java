package com.encapsulationandpolymorphism.ridehailing;

class Bike extends Vehicle {

    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // Bike rate
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

