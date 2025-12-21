// Program for Euclidean distance between two points

import java.util.Scanner;

public class LineAndDistance{

    // Method to calculate Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
     	double dx = x2 - x1;
        double dy = y2 - y1;

        // distance = √[(x2-x1)² + (y2-y1)²]
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        return distance;
    }

    // Method to calculate slope (m) and y-intercept (b)
     public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        // Slope m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // y-intercept b = y1 - m*x1
        double b = y1 - (m * x1);

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calling distance method
        double distance = findDistance(x1, y1, x2, y2);

        // Calling line equation method
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Euclidean Distance between the two points = " + distance);
        System.out.println("Equation of the line: y = " + line[0] + "x + " + line[1]);

        scanner.close();
    }
}
