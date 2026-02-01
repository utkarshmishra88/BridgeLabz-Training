package com.defaultmethodininterface.smartvehicledashboard;
public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car Speed: 75 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}
