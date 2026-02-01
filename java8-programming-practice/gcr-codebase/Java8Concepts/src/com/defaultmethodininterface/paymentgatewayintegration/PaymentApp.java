package com.defaultmethodininterface.paymentgatewayintegration;
import java.util.Scanner;

public class PaymentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User selects payment method
        System.out.println("Choose Payment Method:");
        System.out.println("1. Stripe");
        System.out.println("2. PayPal");
        System.out.println("3. Razorpay");

        int choice = sc.nextInt();

        PaymentProcessor processor = null;

        // Instantiate the chosen payment processor
        switch (choice) {
            case 1 -> processor = new StripePayment();
            case 2 -> processor = new PayPalPayment();
            case 3 -> processor = new RazorpayPayment();
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        processor.pay(amount);
        processor.refund(amount);

        sc.close();
    }
}
