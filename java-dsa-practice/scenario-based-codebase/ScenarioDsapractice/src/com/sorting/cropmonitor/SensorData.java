package com.sorting.cropmonitor;

class SensorData {
    long timestamp;   // epoch time
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}
