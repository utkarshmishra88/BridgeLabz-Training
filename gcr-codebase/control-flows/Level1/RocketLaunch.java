//Java program to count down the number from the user input value to 1 using a while loop for a rocket launch
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        //Creating Scanner Object to take input.
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        //Closing Scanner Stream.
        sc.close();
    }
}
