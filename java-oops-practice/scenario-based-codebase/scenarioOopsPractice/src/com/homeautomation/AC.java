package com.homeautomation;

class AC extends Appliance {

    public AC(int powerConsumption) {
        super(powerConsumption);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC turned ON (Cooling at 24°C)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public void deviceInfo() {
        System.out.println("AC | Power: " + getPowerConsumption() + "W");
    }
}
