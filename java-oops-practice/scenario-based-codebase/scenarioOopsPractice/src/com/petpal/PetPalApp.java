package com.petpal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet pet1 = new Dog("Bruno", 3);
        Pet pet2 = new Cat("Luna", 2);
        Pet pet3 = new Bird("Kiwi", 1);

        pet1.makeSound();
        pet1.feed();
        pet1.play();
        pet1.showStatus();

        pet2.makeSound();
        pet2.sleep();
        pet2.showStatus();

        pet3.makeSound();
        pet3.play();
        pet3.showStatus();
    }
}
