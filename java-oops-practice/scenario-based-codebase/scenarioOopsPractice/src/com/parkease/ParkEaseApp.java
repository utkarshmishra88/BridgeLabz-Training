package com.parkease;
import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Type (Car/Bike/Truck):");
        String type = sc.next();

        System.out.println("Enter Vehicle Number:");
        String number = sc.next();

        System.out.println("Enter Parking Hours:");
        int hours = sc.nextInt();

        Vehicle vehicle = null;

        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car(number);
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(number);
        } else if (type.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(number);
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        ParkingSlot slot = new ParkingSlot(vehicle.getVehicleType());

        if (slot.parkVehicle(vehicle)) {
            System.out.println("Vehicle parked successfully");
            System.out.println("Parking Charges: ₹" + vehicle.calculateCharges(hours));
            System.out.println(slot.getBookingLog());
        } else {
            System.out.println("Parking slot not available");
        }

        sc.close();
    }
}
