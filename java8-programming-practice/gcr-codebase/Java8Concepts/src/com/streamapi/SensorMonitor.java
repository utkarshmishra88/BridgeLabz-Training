package com.streamapi;
import java.util.*;

public class SensorMonitor {

    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(22.5, 35.8, 41.2, 18.9, 50.3, 27.0);

        double threshold = 30.0;

        readings.stream()
                .filter(r -> r > threshold)   // filter high readings
                .forEach(r -> System.out.println("ALERT: " + r));
    }
}
