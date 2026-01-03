package com.cabbygo;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        vehicle.calculateFare(distance);
        System.out.println("Ride Booked ");
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Driver: " + driver.getDriverDetails());
        System.out.println("Fare: " + vehicle.getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended Thank you for using CabbyGo!");
    }
}
