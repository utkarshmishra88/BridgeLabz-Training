//Program for IntOperation
import java.util.Scanner;

public class IntOperation {
public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking input values
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
		System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Performing integer operations (operator precedence applied)
        int result1 = a + b * c;   // * has higher precedence than +
        int result2 = a * b + c;   // * evaluated before +
        int result3 = c + a / b;   // / evaluated before +
        int result4 = a % b + c;   // % evaluated before +

        // Printing the results
        System.out.println("The results of Int Operations are " +result1 + ", " +result2 + ", " +result3 + ", and " +result4);

        sc.close();
    }
}
