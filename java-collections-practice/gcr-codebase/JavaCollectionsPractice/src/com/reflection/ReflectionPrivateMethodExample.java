package com.reflection;
import java.lang.reflect.Method;

// Class with private method
class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}
// Main class to demonstrate reflection
public class ReflectionPrivateMethodExample {
    public static void main(String[] args) throws Exception {

        // Load class
        Class<?> cls = Calculator.class;

        // Create object
        Calculator c = new Calculator();

        // Access private method
        Method m = cls.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);   // allow private access

        // Invoke method
        Object result = m.invoke(c, 4, 5);

        // Display result
        System.out.println("Result: " + result);
    }
}
