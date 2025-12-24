// Program to perform date arithmetic operations

import java.time.LocalDate;
import java.util.Scanner;

public class ArithmeticDate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(input.nextLine());

        // Perform date operations
        LocalDate resultDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        // Display result
        System.out.println("Final Date after operations: " + resultDate);
        
		// Closing scanner stream
        input.close();
    }
}
