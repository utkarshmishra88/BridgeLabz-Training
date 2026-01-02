package com.homeautomation;

class Light extends Appliance {

    public Light() {
        super(40); // default 40W
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON (Soft brightness)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Light | Power: " + getPowerConsumption() + "W");
    }
}
