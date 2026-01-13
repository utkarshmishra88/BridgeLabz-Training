package com.traincompanion;

public class TrainCompanionAap {
	public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("C1", "Sleeper");
        train.addCompartment("C2", "WiFi");
        train.addCompartment("C3", "Pantry");
        train.addCompartment("C4", "AC");

        train.traverseForward();
        train.traverseBackward();

        train.searchService("Pantry");

        train.removeCompartment("C2");

        train.traverseForward();
    }
}