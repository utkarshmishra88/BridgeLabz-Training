package com.reflection;
import java.lang.reflect.Method;
import java.util.Scanner;

// Class with basic math operations
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class ReflectionDynamicMethodExample {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Load class
        Class<?> cls = MathOperations.class;

        // Create object
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Get method dynamically
        Method method = cls.getMethod(methodName, int.class, int.class);

        // Invoke method
        Object result = method.invoke(obj, a, b);

        // Display result
        System.out.println("Result: " + result);
    }
}
