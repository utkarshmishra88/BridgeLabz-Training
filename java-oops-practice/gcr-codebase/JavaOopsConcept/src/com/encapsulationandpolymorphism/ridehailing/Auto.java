package com.encapsulationandpolymorphism.ridehailing;

class Auto extends Vehicle {

    public Auto(int vehicleId, String driverName) {
        super(vehicleId, driverName, 12); // Auto rate
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
