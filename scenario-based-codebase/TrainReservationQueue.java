//Java program for train reservation queue.
import java.util.Scanner;

public class TrainReservationQueue{
	//Main method
	public static void main(String args[]){
		//Scanner object for taking input
		Scanner sc=new Scanner(System.in);
		final int totalSlots = 5;   // Maximum slots.
        int occupiedSlots = 0;
        int choice;
        System.out.println(" Welcome to Ticket Reservation Portal ");
        System.out.println("--------------------------------------");

        // Continue until slot is full
        while (occupiedSlots < totalSlots) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Available Ticket");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Your ticket is booked.");
                    } else {
                        System.out.println("No available tickets!");
                    }
                    break;
                case 2:
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Your ticket is cancelled.");
                    } else {
                        System.out.println("No ticket is there.");
                    }
                    break;
                case 3:
                    System.out.println("Available Slots: " + (totalSlots - occupiedSlots));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            // Stop if slot becomes full
            if (occupiedSlots == totalSlots) {
                System.out.println("\nSlot is FULL. No more tickets allowed.");
                break;
            }
        }

        sc.close();
	}
}	