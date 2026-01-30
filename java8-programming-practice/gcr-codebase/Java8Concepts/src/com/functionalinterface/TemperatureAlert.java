package com.functionalinterface;
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
	
	// Fixed threshold (system rule)
    private static final double THRESHOLD = 40.0;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User enters current temperature
        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

        // Predicate logic
        Predicate<Double> isAlert = temp -> temp > THRESHOLD;

        // Check condition
        if (isAlert.test(currentTemp)) {
            System.out.println("ALERT! Temperature crossed threshold: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemp + "°C");
        }

        sc.close();
    }
}
