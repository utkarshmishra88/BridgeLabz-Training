package com.interfaceimplementation.rentalsystem;
class Bus implements Vehicle{

    @Override
    public void rent(){
        System.out.println("Bus rented for trip basis");
    }

    @Override
    public void returnVehicle(){
        System.out.println("Bus returned successfully");
    }
}
