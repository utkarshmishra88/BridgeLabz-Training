//Java program for calculation the employee-bonus (if eligible).
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
     	// Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take salary and years of service input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Initialize bonus variable
        double bonus = 0;

        // Check if years of service is more than 5
        if (years > 5) {
            bonus = salary * 0.05;     // Calculate 5% bonus on salary
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }

        // Close the Scanner
        sc.close();
    }
}
