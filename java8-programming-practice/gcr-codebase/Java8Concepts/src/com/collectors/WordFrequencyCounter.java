package com.collectors;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is easy java is powerful java is fast";

        Map<String, Integer> frequency =
                Arrays.stream(paragraph.split(" "))
                        .collect(Collectors.toMap(
                                Function.identity(),   // word as key
                                w -> 1,               // initial count
                                Integer::sum));         // merge duplicates

        frequency.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }
}
