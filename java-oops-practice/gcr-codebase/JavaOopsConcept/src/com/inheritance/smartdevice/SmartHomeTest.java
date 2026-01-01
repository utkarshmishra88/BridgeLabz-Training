package com.inheritance.smartdevice;

public class SmartHomeTest {

    public static void main(String[] args) {

        Device device = new Thermostat("THERMO-101", true, 24.5);
        device.displayStatus();
    }
}

