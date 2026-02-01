package com.defaultmethodininterface.smartvehicledashboard;
public interface Vehicle {

    void displaySpeed();

    // New feature added later
    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}
