package com.reflection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

/* This annotation marks a dependency */
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

/* This is a simple dependency class */
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

/* This class depends on Engine */
class Car {

    @Inject
    private Engine engine;   // dependency

    public void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

/* This class works like a very small DI container */
class SimpleDIContainer {

    public static <T> T createObject(Class<T> clazz) throws Exception {

        // Step 1: create object of given class
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Step 2: scan all fields of the class
        for (Field field : clazz.getDeclaredFields()) {

            // Step 3: check if field has @Inject
            if (field.isAnnotationPresent(Inject.class)) {

                // Step 4: create dependency object
                Object dependency = field.getType()
                        .getDeclaredConstructor()
                        .newInstance();

                // Step 5: inject dependency
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
        return obj;
    }
}

/* Main class */
public class ReflectionDIExample {
    public static void main(String[] args) throws Exception {

        // DI container creates object and injects dependency
        Car car = SimpleDIContainer.createObject(Car.class);

        // Use the object
        car.drive();
    }
}
