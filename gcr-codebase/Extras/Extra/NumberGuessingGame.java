// Program for guessing the number
import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between given range
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }

    // Method to get feedback from user
    public static String getUserFeedback(Scanner input) {
        System.out.print("Enter feedback (high / low / correct): ");
        return input.next();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect) {

            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            String feedback = getUserFeedback(input);

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                isCorrect = true;
            }
        }

        input.close();
    }
}
