package com.sorting.movietime;
class MovieTime {

    static void insertionSort(Show[] shows) {

        for (int i = 1; i < shows.length; i++) {
            Show key = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }
            shows[j + 1] = key;
        }
    }

    static void display(Show[] shows) {
        for (Show s : shows) {
            System.out.println(s.movieName + " at " + (s.time / 60) + ":" +
                               String.format("%02d", s.time % 60));
        }
    }

    public static void main(String[] args) {

        Show[] shows = {
            new Show("Avengers", 1020),   // 17:00
            new Show("Inception", 1080),  // 18:00
            new Show("Interstellar", 1140), // 19:00
            new Show("Batman", 1110)      // 18:30 (new show added)
        };

        insertionSort(shows);
        display(shows);
    }
}
