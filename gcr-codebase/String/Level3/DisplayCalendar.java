// Java program to display calendar for a given month and year

import java.util.Scanner;

public class DisplayCalendar {

    // method to get month name
    public static String getMonthName(int month) {

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // method to get first day of the month using Gregorian algorithm
    public static int getFirstDay(int month, int year) {

        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // method to display the calendar
    public static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        // display month and year
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // first for loop for spaces before 1st day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // second for loop to print days
        for (int day = 1; day <= days; day++) {

            System.out.printf("%3d ", day);

            // move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take month and year from user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // display calendar
        displayCalendar(month, year);

        // close scanner
        input.close();
    }
}
