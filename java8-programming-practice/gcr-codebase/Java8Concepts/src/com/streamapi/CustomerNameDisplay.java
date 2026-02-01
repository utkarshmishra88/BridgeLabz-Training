package com.streamapi;
import java.util.*;

public class CustomerNameDisplay {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList("amit","neha","raj","priya","karan");

        customers.stream()
                 .map(String::toUpperCase)   // transform
                 .sorted()                  // sort
                 .forEach(System.out::println);
    }
}
