package com.streamapi;
import java.util.*;
import java.util.stream.*;

// Claim class to represent an insurance claim
class Claim{

    private String type;
    private double amount;

    public Claim(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

    public String getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }
}

// Main class to analyze insurance claims
public class InsuranceAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Car", 12000),
            new Claim("Health", 7000),
            new Claim("Travel", 3000),
            new Claim("Car", 15000),
            new Claim("Health", 6000));

        Map<String, Double> avgClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              Claim::getType,
                              Collectors.averagingDouble(Claim::getAmount)));

        avgClaimAmount.forEach((type, avg) ->
                System.out.println(type + " -> " + avg));
    }
}
