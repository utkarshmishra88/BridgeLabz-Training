package com.travellog;
import java.util.*;

public class TravelLogApp {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-collections-practice\\scenario-based-codebase\\ScenarioColletionsPractice\\src\\com\\travellog\\trips.dat";

        try {
            // Create trips
            List<Trip> trips = List.of(
                new Trip("Paris", "France", 7,
                        "Visited Paris and enjoyed museums and cafes"),
                new Trip("Rome", "Italy", 4,
                        "Rome trip with history and food"),
                new Trip("Paris", "France", 6,
                        "Second visit to Paris for blogging"),
                new Trip("Tokyo", "Japan", 10,
                        "Tokyo and Kyoto travel experience")
            );

            // Save trips
            TravelFileManager.saveTrips(trips, fileName);

            // Load trips
            List<Trip> loadedTrips =
                    TravelFileManager.loadTrips(fileName);

            System.out.println("Trips longer than 5 days:");
            TravelAnalyzer.longTrips(loadedTrips)
                          .forEach(System.out::println);

            System.out.println("\nUnique countries visited:");
            System.out.println(TravelAnalyzer.uniqueCountries(loadedTrips));

            System.out.println("\nCities found using regex:");
            System.out.println(
                TravelAnalyzer.extractCitiesFromNotes(loadedTrips)
            );

            System.out.println("\nTop 3 most visited cities:");
            TravelAnalyzer.topCities(loadedTrips)
                .forEach(e ->
                    System.out.println(e.getKey() + " → " + e.getValue())
                );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
