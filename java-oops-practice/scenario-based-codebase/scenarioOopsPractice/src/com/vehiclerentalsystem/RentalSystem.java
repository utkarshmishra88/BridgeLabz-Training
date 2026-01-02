package com.vehiclerentalsystem;

public class RentalSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Utkarsh");

        Vehicle v1 = new Bike(101, "Hero", 300);
        Vehicle v2 = new Car(102, "Honda", 1200);
        Vehicle v3 = new Truck(103, "Tata", 2500);

        c1.rentVehicle(v1, 3);
        c1.rentVehicle(v2, 2);
        c1.rentVehicle(v3, 1);
    }
}

