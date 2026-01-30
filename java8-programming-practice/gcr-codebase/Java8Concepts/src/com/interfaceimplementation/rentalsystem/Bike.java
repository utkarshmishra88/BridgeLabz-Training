package com.interfaceimplementation.rentalsystem;
class Bike implements Vehicle{

    @Override
    public void rent(){
        System.out.println("Bike rented for hourly basis");
    }

    @Override
    public void returnVehicle(){
        System.out.println("Bike returned successfully");
    }
}
