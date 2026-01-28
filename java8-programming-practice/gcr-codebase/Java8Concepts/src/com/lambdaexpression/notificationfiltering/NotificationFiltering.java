package com.lambdaexpression.notificationfiltering;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("WARNING", "Blood pressure slightly high"),
                new Alert("INFO", "Appointment reminder"),
                new Alert("CRITICAL", "Oxygen level dropped")
        );

        // User preference: show only CRITICAL alerts
        Predicate<Alert> criticalOnly = alert -> alert.type.equals("CRITICAL");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(criticalOnly).forEach(System.out::println);

        // User preference: CRITICAL or WARNING alerts
        Predicate<Alert> criticalOrWarning = alert -> alert.type.equals("CRITICAL")|| alert.type.equals("WARNING");

        System.out.println("\nCritical & Warning Alerts:");
        alerts.stream().filter(criticalOrWarning).forEach(System.out::println);
    }
}