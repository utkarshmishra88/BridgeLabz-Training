package com.smartcitytransport;
class BusService implements TransportService {

    private String name;
    private double fare;
    private int departureTime;

    public BusService(String name, double fare, int departureTime) {
        this.name = name;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return name; }
    public double getFare() { return fare; }
    public int getDepartureTime() { return departureTime; }
}
