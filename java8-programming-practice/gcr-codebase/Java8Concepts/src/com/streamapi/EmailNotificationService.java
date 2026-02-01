package com.streamapi;
import java.util.*;

public class EmailNotificationService {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList("amit@gmail.com","neha@gmail.com","raj@gmail.com","priya@gmail.com");

        emails.forEach(email -> sendEmailNotification(email));
    }

    // simulate email sending
    private static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}
