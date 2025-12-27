package com.constructor.level1;

public class HotelBooking {

    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking previousBooking) {
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    // Display Booking Details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}