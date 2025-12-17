//Create a Program to find remainder and quotient
import java.util.Scanner;

public class QuotientAndRemainder {
public static void main(String[] args) {
// Creating Scanner object to take input from user
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
int number1 = sc.nextInt();
System.out.print("Enter second number: ");
int number2 = sc.nextInt();

// Calculating quotient using division operator
int quotient = number1 / number2;
// Calculating remainder using modulus operator
int remainder = number1 % number2;

// Printing the result
System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 + " and " + number2);

        sc.close();
    }
}
