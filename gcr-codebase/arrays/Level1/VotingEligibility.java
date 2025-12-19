// Program to check voting eligibility of 10 students based on their age
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Define an array of 10 integer elements
        int[] ages = new int[10];

        // Take user input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nVoting Eligibility Result:");

        // Loop through the array and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
