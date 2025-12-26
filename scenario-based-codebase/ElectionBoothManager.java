//Java program for election booth manager.
import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        //Creating scanner object
		Scanner sc = new Scanner(System.in);
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("\nEnter age (-1 to exit): ");
            int age = sc.nextInt();
            // Exit condition
            if (age == -1) {
                break;
            }
            // Eligibility check
            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.print("Cast your vote (1 / 2 / 3): ");
                int vote = sc.nextInt();
                // Record vote
                if (vote == 1) {
                    candidate1Votes++;
                } else if (vote == 2) {
                    candidate2Votes++;
                } else if (vote == 3) {
                    candidate3Votes++;
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
		
        // Final Result
        System.out.println("\n----- Election Result -----");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        sc.close();
    }
}
