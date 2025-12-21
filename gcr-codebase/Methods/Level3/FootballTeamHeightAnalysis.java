//  Program to find the shortest, tallest, and mean height of players
import java.util.Scanner;
import java.util.Random;

public class FootballTeamHeightAnalysis {

    // Method to calculate sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking team name from user
        System.out.print("Enter the Football Team Name: ");
        String teamName = sc.nextLine();

        // Array to store heights of 11 players
        int[] heights = new int[11];

        // Random object to generate heights
        Random random = new Random();

        // Generating random heights between 150 cm and 250 cm
        System.out.println("\nPlayer Heights (in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Calling methods
        int shortestHeight = findShortest(heights);
        int tallestHeight = findTallest(heights);
        double meanHeight = calculateMean(heights);

        // Displaying results
        System.out.println("\n Height Analysis for Team: " + teamName + " ");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
        System.out.println("Mean Height: " + meanHeight + " cm");

        // Closing scanner
        sc.close();
    }
}
