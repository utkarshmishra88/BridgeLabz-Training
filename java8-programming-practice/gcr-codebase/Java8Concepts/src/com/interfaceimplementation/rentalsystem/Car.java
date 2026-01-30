package com.interfaceimplementation.rentalsystem;
class Car implements Vehicle{

    @Override
    public void rent(){
        System.out.println("Car rented for daily basis");
    }

    @Override
    public void returnVehicle(){
        System.out.println("Car returned successfully");
    }
}
