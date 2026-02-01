package com.defaultmethodininterface.smartvehicledashboard;
public class Bike implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Bike Speed: 60 km/h");
    }
}
