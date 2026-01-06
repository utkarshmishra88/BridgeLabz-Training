package com.eventease;
class Event implements ISchedulable {

    private final int eventId;        // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    private static int counter = 1000;

    // Constructor without services
    public Event(String eventName, String location, String date, int attendees, double venueCost) {
        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Operator usage
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    @Override
    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event cancelled");
    }
}
