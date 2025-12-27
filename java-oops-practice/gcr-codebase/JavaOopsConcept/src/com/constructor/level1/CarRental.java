package com.constructor.level1;

public class CarRental {

    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Hatchback";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to Calculate Total Cost
    double calculateTotalCost() {
        return rentalDays * 1500;
    }

    // Display Rental Details
    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

