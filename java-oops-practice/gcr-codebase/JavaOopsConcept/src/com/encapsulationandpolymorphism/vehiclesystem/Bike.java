package com.encapsulationandpolymorphism.vehiclesystem;

class Bike extends Vehicle implements Insurable {

    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹200";
    }
}

