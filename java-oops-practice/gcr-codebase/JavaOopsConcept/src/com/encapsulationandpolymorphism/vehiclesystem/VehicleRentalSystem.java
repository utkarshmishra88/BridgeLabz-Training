package com.encapsulationandpolymorphism.vehiclesystem;
import java.util.*;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle v1 = new Car("MP09-1234", 2000);
        Vehicle v2 = new Bike("MP09-5678", 500);
        Vehicle v3 = new Truck("MP09-9999", 4000);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        int days = 3;

        for (Vehicle vehicle : vehicles) {

            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable insurable) {
                insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insuranceCost);
            System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
            System.out.println("-----------------------------------");
        }
    }
}
