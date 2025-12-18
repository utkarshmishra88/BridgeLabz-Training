//Java program to count down the number from the user input value to 1 using a for loop for a rocket launch
import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        //Creating Scanner Object for taking input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown starting number: ");
        int start = sc.nextInt();

        // Countdown using for loop
        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter);
        }

        //Closing Scanner Stream.
        sc.close();
    }
}