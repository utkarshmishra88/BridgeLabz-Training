//Java program for smart parking system.
import java.util.Scanner;

public class SmartParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalSlots = 5;   // Maximum parking capacity
        int occupiedSlots = 0;
        int choice;
        System.out.println(" Welcome to Smart Parking System ");
        System.out.println("---------------------------------");

        // Continue until parking is full
        while (occupiedSlots < totalSlots) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking Lot is Full!");
                    }
                    break;
                case 2:
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking Lot is already empty.");
                    }
                    break;
                case 3:
                    System.out.println("Occupied Slots: " + occupiedSlots);
                    System.out.println("Available Slots: " + (totalSlots - occupiedSlots));
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            // Stop if parking becomes full
            if (occupiedSlots == totalSlots) {
                System.out.println("\nParking Lot is FULL. No more vehicles allowed.");
                break;
            }
        }

        sc.close();
    }
}
