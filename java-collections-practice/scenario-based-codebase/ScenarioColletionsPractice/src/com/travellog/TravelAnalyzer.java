package com.travellog;
import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    // Find all cities mentioned in travel notes using regex
    public static Set<String> extractCitiesFromNotes(List<Trip> trips) {
        Set<String> cities = new HashSet<>();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]+\\b");

        for (Trip trip : trips) {
            Matcher matcher = pattern.matcher(trip.getTravelNotes());
            while (matcher.find()) {
                cities.add(matcher.group());
            }
        }
        return cities;
    }

    // Trips longer than 5 days
    public static List<Trip> longTrips(List<Trip> trips) {
        List<Trip> result = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getDurationDays() > 5) {
                result.add(trip);
            }
        }
        return result;
    }

    // Unique countries visited
    public static Set<String> uniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();
        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }
        return countries;
    }

    // Top 3 most visited cities
    public static List<Map.Entry<String, Integer>> topCities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip trip : trips) {
            cityCount.put(trip.getCity(),
                    cityCount.getOrDefault(trip.getCity(), 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(cityCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        return list.subList(0, Math.min(3, list.size()));
    }
}
