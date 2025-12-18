// Program to check whether a given year is a Leap Year or not
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

         
        // Check for Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582.");
        }
        else {
		//Part 1
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year.");
            } else {
                System.out.println("Year is not a Leap Year.");
            }
        }
		
		//Part 2
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year (logical condition).");
        } else if (year >= 1582) {
            System.out.println("Year is not a Leap Year (logical condition).");
        }

        sc.close();
    }
}
