// Program to find greatest common divisor and LCM 
import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Method to calculate LCM
    public static int calculateLCM(int a, int b) {

        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        
		// Closing scanner stream
        input.close();
    }
}
