//Java program for phone recharge simulator.
import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        char choice;
        do {
            System.out.print("\nEnter Mobile Operator (Jio/Airtel/VI): ");
            String operator = sc.next().toLowerCase();
            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();
            balance += amount;
            // Switch for operator-wise offers
            switch (operator) {
                case "jio":
                    System.out.println("Offer: 1.5GB/day + Unlimited Calls");
                    break;

                case "airtel":
                    System.out.println("Offer: 2GB/day + Free OTT Access");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("No offers available for this operator.");
            }

            System.out.println("Current Balance: " + balance);
            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = sc.next().toUpperCase().charAt(0);

        } while (choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator ");
        sc.close();
    }
}
