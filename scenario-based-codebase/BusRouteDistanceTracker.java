//Java program for Bus route tracker.
import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalDistance = 0.0;
        int stopNumber = 1;
        char getOff = 'n';
        while (getOff != 'y') {
            System.out.println("\n--- Stop " + stopNumber + " ---");
            System.out.print("Enter distance traveled from previous stop (in km): ");
            double distance = sc.nextDouble();
            totalDistance += distance;
            System.out.println("Total distance traveled so far: "
                    + totalDistance + " km");
            System.out.print("Do you want to get off at this stop? (y/n): ");
            getOff = sc.next().toLowerCase().charAt(0);
            stopNumber++;
        }

        System.out.println("\nPassenger got off the bus");
        System.out.println("Final distance traveled: " + totalDistance + " km");

        sc.close();
    }
}
