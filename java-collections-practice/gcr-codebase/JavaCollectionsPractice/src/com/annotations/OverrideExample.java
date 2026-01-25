package com.annotations;

//Animal class with a method makeSound
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

	//Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideExample {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
    }
}
