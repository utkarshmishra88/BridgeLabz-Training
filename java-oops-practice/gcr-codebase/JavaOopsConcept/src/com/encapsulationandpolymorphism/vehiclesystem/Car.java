package com.encapsulationandpolymorphism.vehiclesystem;

class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹500 (Flat)";
    }
}

