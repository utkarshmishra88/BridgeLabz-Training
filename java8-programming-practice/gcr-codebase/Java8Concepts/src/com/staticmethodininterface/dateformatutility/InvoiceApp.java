package com.staticmethodininterface.dateformatutility;
import java.time.LocalDate;
import java.util.Scanner;

// Application to demonstrate date formatting utility
public class InvoiceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate today = LocalDate.now();

        // Display menu
        System.out.println("=== Date Format Utility ===");
        System.out.println("1. Indian Format (dd-MM-yyyy)");
        System.out.println("2. US Format (MM/dd/yyyy)");
        System.out.println("3. Invoice Format (dd MMM yyyy)");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        String formattedDate;

        switch (choice) {
            case 1 -> formattedDate = DateFormatterUtil.toIndianFormat(today);
            case 2 -> formattedDate = DateFormatterUtil.toUSFormat(today);
            case 3 -> formattedDate = DateFormatterUtil.toInvoiceFormat(today);
            default -> {
                System.out.println("Invalid choice");
                sc.close();
                return;
            }
        }

        System.out.println("Formatted Date: " + formattedDate);

        sc.close();
    }
}
