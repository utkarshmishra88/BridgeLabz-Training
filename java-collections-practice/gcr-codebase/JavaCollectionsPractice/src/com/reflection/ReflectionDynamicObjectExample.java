package com.reflection;
import java.lang.reflect.Constructor;

class Student1{
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ReflectionDynamicObjectExample {
    public static void main(String[] args) throws Exception {

        // Load class
        Class<?> cls = Student1.class;

        // Get constructor
        Constructor<?> cons = cls.getConstructor(String.class);

        // Create object dynamically (no new keyword)
        Object obj = cons.newInstance("Emma");

        // Type cast and call method
        Student1 s = (Student1) obj;
        s.display();
    }
}
