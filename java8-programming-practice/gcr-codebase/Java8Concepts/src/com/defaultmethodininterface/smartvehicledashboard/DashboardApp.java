package com.defaultmethodininterface.smartvehicledashboard;
public class DashboardApp {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle ev = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        bike.displaySpeed();
        bike.displayBattery();

        ev.displaySpeed();
        ev.displayBattery();
    }
}
