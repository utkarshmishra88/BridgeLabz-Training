package com.streamapi;
import java.util.*;
import java.util.stream.*;

class Movie{
    String name;
    double rating;
    int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating(){
    	return rating;
   	}
    public int getYear(){
    	return year;
   	}

    @Override
    public String toString(){
        return name + " | Rating: " + rating + " | Year: " + year;
    }
}

public class Main{
    public static void main(String[] args){

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.2, 2024),
            new Movie("Movie C", 8.8, 2022),
            new Movie("Movie D", 9.0, 2021),
            new Movie("Movie E", 7.9, 2024),
            new Movie("Movie F", 9.5, 2025),
            new Movie("Movie G", 8.7, 2019));

        movies.stream()
              .filter(m -> m.getYear() >= 2020)  // remove old movies
              .sorted(Comparator
                      .comparing(Movie::getRating).reversed()
                      .thenComparing(Movie::getYear).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
