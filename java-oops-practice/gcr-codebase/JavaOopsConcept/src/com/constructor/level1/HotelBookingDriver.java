package com.constructor.level1;

public class HotelBookingDriver {

	public static void main(String[] args) {

        // Default Constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1:");
        booking1.displayBookingDetails();

        // Parameterized Constructor
        HotelBooking booking2 = new HotelBooking("Amit", "Deluxe", 3);
        System.out.println("\nBooking 2:");
        booking2.displayBookingDetails();

        // Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nBooking 3 (Copy of Booking 2):");
        booking3.displayBookingDetails();
    }

}
