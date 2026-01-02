package com.homeautomation;

class Fan extends Appliance {

    public Fan(int powerConsumption) {
        super(powerConsumption); // user-defined
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan turned OFF");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Fan | Power: " + getPowerConsumption() + "W");
    }
}

