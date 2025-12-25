//Java program for BMI fitness tracker
import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking height and weight input in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculating BMI 
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);

        // Checking BMI category 
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing the scanner
        scanner.close();
    }
}
