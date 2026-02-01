package com.smartcitytransport;
import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("Bus A", 20, 9),
                new BusService("Bus B", 15, 7),
                new TaxiService("Taxi X", 100, 8),
                new TaxiService("Taxi Y", 80, 6),
                new AmbulanceService()
        );

        // 1️Lambda → filter + sort
        System.out.println("Earliest & Cheapest Services:");
        services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .sorted(Comparator.comparing(TransportService::getFare)
                        .thenComparing(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);


        // 2️Method reference → dashboard print
        System.out.println("\nLive Dashboard:");
        services.forEach(TransportService::printServiceDetails);


        // 3️⃣ Functional interface → fare calculation
        FareCalculator calc = (base, dist) -> base + dist * 5;
        double fare = calc.calculateFare(50, 10);
        System.out.println("\nCalculated Fare: " + fare);


        // 4️Collectors → grouping revenue
        Map<String, Double> revenue =
                services.stream()
                        .collect(Collectors.groupingBy(
                                TransportService::getServiceName,
                                Collectors.summingDouble(TransportService::getFare)
                        ));

        System.out.println("\nRevenue Summary: " + revenue);


        // 5️Partition peak vs non-peak
        Map<Boolean, List<TransportService>> peak =
                services.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getDepartureTime() >= 8
                        ));

        System.out.println("\nPeak Services: " + peak.get(true).size());


        // 6️Emergency detection
        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);
    }
}
