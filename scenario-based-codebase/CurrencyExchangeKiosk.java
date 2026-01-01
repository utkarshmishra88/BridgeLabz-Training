//Java program for currency exchange kiosk.
import java.util.Scanner;

public class CurrencyExchangeKiosk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("\nEnter amount in INR: ");
            double inrAmount = sc.nextDouble();
            System.out.println("\nSelect target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter your choice (1-4): ");
            int currencyChoice = sc.nextInt();
            double convertedAmount = 0.0;
            String currencyName = "";
            // Switch for currency conversion
            switch (currencyChoice) {
                case 1:
                    convertedAmount = inrAmount * 0.012; // USD
                    currencyName = "USD";
                    break;
                case 2:
                    convertedAmount = inrAmount * 0.011; // EUR
                    currencyName = "EUR";
                    break;
                case 3:
                    convertedAmount = inrAmount * 0.010; // GBP
                    currencyName = "GBP";
                    break;
                case 4:
                    convertedAmount = inrAmount * 1.63; // JPY
                    currencyName = "JPY";
                    break;
                default:
                    System.out.println("Invalid currency selection");
            }
            if (convertedAmount > 0) {
                System.out.printf("Converted Amount: %.2f %s%n",
                        convertedAmount, currencyName);
            }
            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.println("\nThank you for using Currency Exchange Kiosk 💱");
        sc.close();
    }
}
