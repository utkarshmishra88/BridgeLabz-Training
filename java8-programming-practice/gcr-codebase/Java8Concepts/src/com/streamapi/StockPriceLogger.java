package com.streamapi;
import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(152.35, 153.10, 151.90, 154.25, 155.00);

        stockPrices.stream()
                   .forEach(System.out::println);
    }
}
