package com.defaultmethodininterface.smartvehicledashboard;
public class Car implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Car Speed: 80 km/h");
    }
}
