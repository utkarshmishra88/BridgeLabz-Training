//Java program for smart card of metro.
import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        double balance = 100.0; // Initial smart card balance
        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (-1 to quit): ");
            int distance = sc.nextInt();
            // Exit condition
            if (distance == -1) {
                break;
            }
            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10: (distance <= 15) ? 20: 30;
            // Check sufficient balance
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted successfully.");
            } else {
                System.out.println("Insufficient balance. Please recharge!");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}
