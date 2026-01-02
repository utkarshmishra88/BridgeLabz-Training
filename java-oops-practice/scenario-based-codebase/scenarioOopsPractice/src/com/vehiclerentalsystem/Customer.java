package com.vehiclerentalsystem;

class Customer {
    private int customerId;
    private String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle v, int days) {
        v.getDetails();
        System.out.println("Total Rent: ₹" + v.calculateRent(days));
    }
}
