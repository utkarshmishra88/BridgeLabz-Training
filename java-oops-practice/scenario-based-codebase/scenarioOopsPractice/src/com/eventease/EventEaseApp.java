package com.eventease;
public class EventEaseApp {

    public static void main(String[] args) {

        User organizer = new User("Utkarsh", "utkarsh@email.com");

        Event birthday = new BirthdayEvent(
                "Rahul's Birthday", "Banquet Hall", "10-Apr-2026",
                50, 15000, 5000
        );

        Event conference = new ConferenceEvent(
                "Tech Conference", "Convention Center", "20-May-2026",
                300, 80000, 20000
        );

        birthday.schedule();
        System.out.println("Total Cost: " + birthday.calculateTotalCost());

        conference.schedule();
        System.out.println("Total Cost: " + conference.calculateTotalCost());
    }
}
