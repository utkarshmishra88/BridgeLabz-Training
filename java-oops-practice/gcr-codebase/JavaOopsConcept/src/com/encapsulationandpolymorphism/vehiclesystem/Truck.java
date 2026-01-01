package com.encapsulationandpolymorphism.vehiclesystem;

class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // heavy vehicle surcharge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹1000 (Heavy Vehicle)";
    }
}
