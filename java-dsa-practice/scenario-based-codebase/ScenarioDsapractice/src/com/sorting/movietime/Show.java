package com.sorting.movietime;

// Movie show: title and start time (minutes since midnight)
class Show {
    // movie title
	String movieName;
    // start time in minutes (0-1439)
	int time;

    // create a show
	Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }
}