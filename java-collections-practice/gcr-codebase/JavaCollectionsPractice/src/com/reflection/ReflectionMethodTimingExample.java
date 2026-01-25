package com.reflection;
import java.lang.reflect.Method;

class Task {

    public void fastTask() {
        for (int i = 0; i < 1000; i++);
    }

    public void slowTask() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class ReflectionMethodTimingExample {

    // Method to execute and measure time
    public static void executeWithTiming(Object obj) throws Exception {

        Class<?> cls = obj.getClass();

        // Get all methods of class
        for (Method method : cls.getDeclaredMethods()) {

            // Measure start time
            long startTime = System.nanoTime();

            // Invoke method
            method.invoke(obj);

            // Measure end time
            long endTime = System.nanoTime();

            // Print execution time
            System.out.println(
                method.getName() + " executed in " +
                (endTime - startTime) + " ns"
            );
        }
    }

    public static void main(String[] args) throws Exception {

        Task task = new Task();

        // Measure execution time dynamically
        executeWithTiming(task);
    }
}
