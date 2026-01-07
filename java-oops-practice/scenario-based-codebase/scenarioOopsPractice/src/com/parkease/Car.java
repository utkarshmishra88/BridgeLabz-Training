package com.parkease;
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 5) total += 100;
        return total;
    }

    public String getVehicleType() {
        return "Car";
    }
}
