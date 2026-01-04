package com.stacksandqueues.circulartour;
import java.util.*;
public class CircularTour {

    public static int findStartingPoint(Queue<PetrolPump> queue, int n) {

        int start = 0;
        int petrolBalance = 0;
        int visited = 0;

        while (start < n) {
            petrolBalance = 0;
            visited = 0;

            for (PetrolPump pump : queue) {
                petrolBalance += pump.petrol - pump.distance;
                visited++;

                if (petrolBalance < 0) {
                    break;
                }
            }

            if (visited == n && petrolBalance >= 0) {
                return start;
            }

            // Rotate queue to try next starting point
            queue.offer(queue.poll());
            start++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<PetrolPump> queue = new LinkedList<>();

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            int petrol = sc.nextInt();
            int distance = sc.nextInt();
            queue.offer(new PetrolPump(petrol, distance));
        }

        int result = findStartingPoint(queue, n);

        if (result == -1) {
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start at petrol pump index: " + result);
        }
    }
}
