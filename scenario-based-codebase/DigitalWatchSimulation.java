//Java program for digital watch simulation.

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalWatchSimulation {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                LocalTime time = LocalTime.of(hour, minute);
                System.out.println(time.format(formatter));

                // power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped at 13:00");
                    return;
                }
            }
        }
    }
}
