package com.interfaceimplementation.rentalsystem;
public class RentalSystem{
    public static void main(String[] args){
    	
    	// Creating instances of different vehicle types
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        // Renting and returning vehicles
        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
