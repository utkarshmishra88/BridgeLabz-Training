package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

/* Step 1: Define custom annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

/* Step 2: Apply annotation to methods */
class PerformanceTest {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1_000_000; i++);
    }

    public void normalTask() {
        System.out.println("Normal task (not logged)");
    }
}

/* Step 3: Measure execution time using Reflection */
public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {

        PerformanceTest obj = new PerformanceTest();
        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();

                method.invoke(obj);

                long endTime = System.nanoTime();

                System.out.println(
                    method.getName() + " executed in " +
                    (endTime - startTime) + " ns"
                );
            }
        }
    }
}
