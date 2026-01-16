package com.sorting.cinemahouse;
import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort by showTime (ascending)
    public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization for already sorted data
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();

        MovieShow[] shows = new MovieShow[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter movie name: ");
            String name = sc.next();
            System.out.print("Enter show time (HHMM): ");
            int time = sc.nextInt();
            shows[i] = new MovieShow(name, time);
        }

        bubbleSort(shows);
        System.out.println("\nSorted Movie Shows:");
        for (MovieShow m : shows) {
            System.out.println(m.movieName + " at " + m.showTime);
        }

        sc.close();
    }
}