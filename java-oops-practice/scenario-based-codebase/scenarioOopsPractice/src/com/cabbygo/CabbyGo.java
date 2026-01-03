package com.cabbygo;
import java.util.Scanner;

public class CabbyGo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User choice
        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        int choice = sc.nextInt();

        Vehicle vehicle;
        switch (choice) {
            case 1 -> vehicle = new Mini();
            case 2 -> vehicle = new Sedan();
            case 3 -> vehicle = new SUV();
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        // System assigned driver
        Driver driver = new Driver("Suresh Kumar", "DL55599", 4.6);

        IRideService ride = new RideService(vehicle, driver);
        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}

