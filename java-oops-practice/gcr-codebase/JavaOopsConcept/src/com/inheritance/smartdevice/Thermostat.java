package com.inheritance.smartdevice;

public class Thermostat extends Device {

    double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding method
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}

