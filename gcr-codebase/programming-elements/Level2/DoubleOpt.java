import java.util.Scanner;

public class DoubleOpt {
public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking double input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Performing double operations (operator precedence applied)
        double result1 = a + b * c;   // * before +
        double result2 = a * b + c;   // * before +
        double result3 = c + a / b;   // / before +
        double result4 = a % b + c;   // % before +

        // Printing the results
        System.out.println("The results of Double Operations are " +result1 + ", " +result2 + ", " +result3 + ", and " +result4);

        sc.close();
    }
}
