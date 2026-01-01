package com.inheritance.smartdevice;

public class Device {

    String deviceId;
    boolean status; // true = ON, false = OFF

    // Constructor
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to be overridden
    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
    }
}

