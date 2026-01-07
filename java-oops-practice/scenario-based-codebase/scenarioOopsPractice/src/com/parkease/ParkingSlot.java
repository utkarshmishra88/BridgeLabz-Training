package com.parkease;
public class ParkingSlot {

    private final int slotId;
    private static int counter = 0;

    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String bookingLog;

    public ParkingSlot(String vehicleTypeAllowed) {
        this.slotId = ++counter;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied &&
            vehicle.getVehicleType().equalsIgnoreCase(vehicleTypeAllowed)) {

            isOccupied = true;
            bookingLog = "Vehicle " + vehicle.vehicleNumber +
                         " parked in slot " + slotId;
            return true;
        }
        return false;
    }

    public String getBookingLog() {
        return bookingLog;
    }
}
