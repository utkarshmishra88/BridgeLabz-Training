package com.smartcitytransport;
interface TransportService {

    String getServiceName();
    double getFare();
    int getDepartureTime(); // 24hr format

    // Default method
    default void printServiceDetails() {
        System.out.println(getServiceName() + " | Fare: " + getFare() +" | Departure: " + getDepartureTime());
    }
}
