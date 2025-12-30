//Java proggram for movie ticket booking app
import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        
		//Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        char continueBooking='y';
        do {
            int ticketPrice = 0;
            int seatPrice = 0;
            int snackPrice = 0;
			
            // Movie type input
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
			
            System.out.print("Enter choice: ");
            int movieType = scanner.nextInt();
            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }
			
            // Seat type input
            System.out.print("Choose Seat Type (Gold/Silver): ");
            String seatType = scanner.next();
            if (seatType.equalsIgnoreCase("Gold")) {
                seatPrice = 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                seatPrice = 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks input
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = scanner.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            int totalAmount = ticketPrice + seatPrice + snackPrice;

            // Bill summary
            System.out.println("--------- Booking Summary ---------");
            System.out.println("Movie Ticket Price : " + ticketPrice);
            System.out.println("Seat Price         : " + seatPrice);
            System.out.println("Snacks Price       : " + snackPrice);
            System.out.println("Total Amount       : " + totalAmount);
            System.out.println("-----------------------------------");

            System.out.print("\nBook another ticket? (y/n): ");
            continueBooking = scanner.next().charAt(0);

        } while(continueBooking=='y'||continueBooking=='Y');
        System.out.println("Thank you");
        scanner.close();
    }
}
