package com.inheritance.vehiclemanagement;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        Vehicle pv = new PetrolVehicle("Honda City", 180);

        ev.displayDetails();
        ((ElectricVehicle) ev).charge();
        System.out.println();

        pv.displayDetails();
        ((Refuelable) pv).refuel();
    }
}

