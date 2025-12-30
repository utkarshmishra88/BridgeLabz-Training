//Java program for Library Remider App.
import java.util.Scanner;

public class LibraryReminderApp {
    public static void main(String[] args) {
		
		//Creating Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        final int FINE_PER_DAY = 5;
		
		//for loop to interate all books
        for (int bookNumber = 1; bookNumber <= 5; bookNumber++) {
            System.out.println("\nBook " + bookNumber);
            System.out.print("Enter Due Date (day): ");
            int dueDate = scanner.nextInt();
            System.out.print("Enter Return Date (day): ");
            int returnDate = scanner.nextInt();
			
			//count amount
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fineAmount = lateDays * FINE_PER_DAY;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine Amount: " + fineAmount);
            } else {
                System.out.println("Returned on time. No fine");
            }
			
        }

        scanner.close();
        System.out.println("\nThank you for using Rohan’s Library Reminder App");
    }
}
