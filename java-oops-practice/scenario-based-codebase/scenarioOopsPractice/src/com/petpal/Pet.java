package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;

    // Constructor with random defaults
    public Pet(String name, String type, int age) {
        Random r = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = r.nextInt(40) + 30;
        this.energy = r.nextInt(40) + 40;
        updateMood();
    }

    // Abstract method for polymorphism
    public abstract void makeSound();

    // Encapsulation: state changes only via methods
    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        energy += 10;
        updateMood();
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        updateMood();
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        updateMood();
    }

    private void updateMood() {
        if (energy > 60 && hunger < 40)
            mood = "Happy";
        else if (hunger > 70)
            mood = "Hungry";
        else
            mood = "Normal";
    }

    // Read-only access
    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger +
                " | Energy: " + energy +
                " | Mood: " + mood);
    }
}

