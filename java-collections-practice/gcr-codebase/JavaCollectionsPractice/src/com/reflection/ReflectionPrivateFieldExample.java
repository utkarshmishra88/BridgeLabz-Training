package com.reflection;
import java.lang.reflect.Field;

// Class with private field
class Person{
    private int age;
}

// Main class to demonstrate reflection on private field
public class ReflectionPrivateFieldExample{
    public static void main(String[] args) throws Exception{

        // Load class
        Class<?> cls = Person.class;

        // Create object
        Person p = new Person();

        // Access private field
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);   // allow access to private field

        // Modify value
        field.setInt(p, 25);

        // Retrieve value
        System.out.println("Age: " + field.getInt(p));
    }
}
