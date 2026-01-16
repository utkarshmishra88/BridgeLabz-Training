package com.sorting.cinemahouse;

class MovieShow {
    String movieName;
    int showTime;   // time in 24-hour format (e.g., 1030 = 10:30)

    MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }
}