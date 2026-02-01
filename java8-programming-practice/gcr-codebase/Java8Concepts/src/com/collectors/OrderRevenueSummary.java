package com.collectors;
import java.util.*;
import java.util.stream.*;

class Order {

    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Amit", 2500),
                new Order("Neha", 1800),
                new Order("Amit", 1200),
                new Order("Raj", 3000),
                new Order("Neha", 2200));

        Map<String, Double> revenueSummary =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomerName,
                              Collectors.summingDouble(Order::getTotalAmount)));

        revenueSummary.forEach((customer, total) ->
                System.out.println(customer + " -> " + total));
    }
}
