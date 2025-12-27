package com.constructor.level1;

public class Vehicle {

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable 
    private static double registrationFee = 5000;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : " + registrationFee);
        System.out.println("-------------------------------");
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Anuj", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(6500);

        System.out.println("After Registration Fee Update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
