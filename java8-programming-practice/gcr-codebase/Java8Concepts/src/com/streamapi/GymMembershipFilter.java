package com.streamapi;
import java.time.LocalDate;
import java.util.*;

// Class representing a gym member
class Member{

    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate){
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    @Override
    public String toString(){
        return name + " - Expiry: " + expiryDate;
    }
}

// Main class to filter gym members
public class GymMembershipFilter{

    public static void main(String[] args){

        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Neha", LocalDate.now().plusDays(45)),
            new Member("Raj", LocalDate.now().plusDays(25)),
            new Member("Priya", LocalDate.now().plusDays(5)),
            new Member("Karan", LocalDate.now().plusDays(60)));

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               .filter(m -> !m.getExpiryDate().isBefore(today) &&
                            !m.getExpiryDate().isAfter(next30Days))
               .forEach(System.out::println);
    }
}
