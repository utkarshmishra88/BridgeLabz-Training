package com.constructor.level1;

public class CarRentalDriver {

	public static void main(String[] args) {

        // Default Constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1:");
        rental1.displayRentalDetails();

        // Parameterized Constructor
        CarRental rental2 = new CarRental("Rohit", "Sedan", 4);
        System.out.println("\nRental 2:");
        rental2.displayRentalDetails();
    }

}
