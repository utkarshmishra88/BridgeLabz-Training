package com.sorting.artexpo;
import java.util.*;

public class ArtExpo {
    public static void main(String[] args) {

        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Alice", 10));
        artists.add(new Artist("Bob", 5));
        artists.add(new Artist("Carol", 8));
        artists.add(new Artist("David", 12));

        // insertion sort by registration time
        for (int i = 1; i < artists.size(); i++) {
            Artist key = artists.get(i);
            int j = i - 1;

            while (j >= 0 && artists.get(j).time > key.time) {
                artists.set(j + 1, artists.get(j));
                j--;
            }
            artists.set(j + 1, key);
        }

        // final order
        for (Artist a : artists)
            System.out.println(a.name + " " + a.time);
    }
}