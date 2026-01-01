package com.inheritance.vehiclemanagement;

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle");
    }
}

