package com.parkease;
public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 4) total += 200;
        return total;
    }

    public String getVehicleType() {
        return "Truck";
    }
}
