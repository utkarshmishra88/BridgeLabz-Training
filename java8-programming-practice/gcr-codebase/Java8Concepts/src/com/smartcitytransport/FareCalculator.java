package com.smartcitytransport;

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double baseFare, double distance);
}
