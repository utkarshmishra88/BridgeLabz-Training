package com.parkease;
public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 6) total += 50;
        return total;
    }

    public String getVehicleType() {
        return "Bike";
    }
}
