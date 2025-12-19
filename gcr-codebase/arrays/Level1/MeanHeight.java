// Program to calculate the mean height of players in a football team

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        // create a double array of size 11
        double[] heights = new double[11];

        double sum = 0.0;

        // take input
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find the sum of all elements and calculate mean 
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / heights.length;

        System.out.println("\nMean height of the football team: " + mean);

        sc.close();
    }
}
