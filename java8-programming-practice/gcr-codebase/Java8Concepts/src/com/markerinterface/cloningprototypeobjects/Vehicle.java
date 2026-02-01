package com.markerinterface.cloningprototypeobjects;
public class Vehicle implements Cloneable {

    private String model;
    private double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return model + " : " + price;
    }
}
