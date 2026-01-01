package com.encapsulationandpolymorphism.ridehailing;

public class RideHailingApp {

    public static void main(String[] args) {

        Vehicle v1 = new Car(201, "Ramesh");
        Vehicle v2 = new Bike(202, "Suresh");
        Vehicle v3 = new Auto(203, "Mahesh");

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);
    }

    // Polymorphic method
    static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance   : " + distance + " km");
        System.out.println("Fare       : ₹" + vehicle.calculateFare(distance));
        System.out.println("-------------------------------");
    }
}

