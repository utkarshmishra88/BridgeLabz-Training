//Java program for online quiz app.
import java.util.Scanner;

public class OnlineQuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Questions array
        String[] questions = {
                "1. Which keyword is used to inherit a class in Java?",
                "2. Which data type is used to store decimal values?",
                "3. Which loop is guaranteed to execute at least once?",
                "4. Which method is the entry point of Java program?",
                "5. Which operator is used for object reference?"
        };

        // Options array
        String[][] options = {
                {"a) this", "b) super", "c) extends", "d) implements"},
                {"a) int", "b) float", "c) char", "d) boolean"},
                {"a) for", "b) while", "c) do-while", "d) foreach"},
                {"a) start()", "b) main()", "c) run()", "d) init()"},
                {"a) .", "b) ->", "c) &", "d) *"}
        };

        // Correct answers
        char[] answers = {'c', 'b', 'c', 'b', 'a'};
        int score = 0;
        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);
            // Switch for answer checking
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct");
                        score++;
                    } else {
                        System.out.println("Wrong");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        // Final score
        System.out.println("\n==============================");
        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("==============================");

        sc.close();
    }
}
