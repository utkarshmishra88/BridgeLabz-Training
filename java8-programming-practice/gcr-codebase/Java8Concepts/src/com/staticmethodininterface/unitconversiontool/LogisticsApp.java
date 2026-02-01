package com.staticmethodininterface.unitconversiontool;
import java.util.Scanner;

public class LogisticsApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("=== Unit Conversion Tool ===");
        System.out.println("1. KM → Miles");
        System.out.println("2. Miles → KM");
        System.out.println("3. KG → LBS");
        System.out.println("4. LBS → KG");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        double result = 0;

        // Perform conversion based on user choice
        switch (choice) {
            case 1 -> result = UnitConverter.kmToMiles(value);
            case 2 -> result = UnitConverter.milesToKm(value);
            case 3 -> result = UnitConverter.kgToLbs(value);
            case 4 -> result = UnitConverter.lbsToKg(value);
            default -> {
                System.out.println("Invalid choice");
                sc.close();
                return;
            }
        }

        System.out.println("Converted value = " + result);

        sc.close();
    }
}
