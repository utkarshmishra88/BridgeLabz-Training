package com.homeautomation;

abstract class Appliance implements Controllable {

    private boolean powerStatus;   // internal state (encapsulated)
    private int powerConsumption;  // watts

    // Constructor
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.powerStatus = false;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    public boolean isOn() {
        return powerStatus;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void deviceInfo();
}
