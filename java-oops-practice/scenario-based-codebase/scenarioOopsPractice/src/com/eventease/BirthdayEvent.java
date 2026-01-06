package com.eventease;
class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees,
                          double venueCost, double serviceCost) {
        super(name, location, date, attendees, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday event scheduled with decorations!");
    }
}
