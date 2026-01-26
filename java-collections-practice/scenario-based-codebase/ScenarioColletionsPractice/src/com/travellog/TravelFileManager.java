package com.travellog;
import java.io.*;
import java.util.*;

public class TravelFileManager {

    public static void saveTrips(List<Trip> trips, String fileName) throws IOException {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(trips);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Trip> loadTrips(String fileName)
            throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Trip>) ois.readObject();
        }
    }
}
