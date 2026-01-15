package com.trafficmanager;
import java.util.Scanner;

public class TrafficManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        WaitingQueue queue = new WaitingQueue(3);

        int choice;

        do {
            System.out.println("\n1.Enter Vehicle");
            System.out.println("2.Exit Vehicle");
            System.out.println("3.Print Roundabout");
            System.out.println("4.Move from Queue to Roundabout");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String v = sc.nextLine();
                    if (roundabout.isEmpty()) {
                        roundabout.addVehicle(v);
                    } else {
                        queue.enqueue(v);
                    }
                    break;

                case 2:
                    System.out.print("Enter vehicle number to exit: ");
                    roundabout.removeVehicle(sc.nextLine());
                    break;

                case 3:
                    roundabout.printRoundabout();
                    break;

                case 4:
                    if (!queue.isEmpty()) {
                        roundabout.addVehicle(queue.dequeue());
                    } else {
                        System.out.println("No vehicles in queue");
                    }
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
