// Java program to check whether a given year is a Leap Year or not.
import java.util.Scanner;

public class LeapYearUsingMethod {
    // Method to check Leap Year based on given conditions
    public static boolean checkLeapYear(int year){
        if(year >= 1582){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                return true;
        }
        return false;
    }

    // Main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(checkLeapYear(year))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");

        sc.close();
    }
}
