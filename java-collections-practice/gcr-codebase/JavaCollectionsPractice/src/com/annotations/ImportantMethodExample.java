package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

/* Step 1: Define custom annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";   // optional parameter with default value
}

/* Step 2: Apply annotation to methods */
class Service {

    @ImportantMethod
    public void processData() {
        System.out.println("Processing data");
    }

    @ImportantMethod(level = "MEDIUM")
    public void validateData() {
        System.out.println("Validating data");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}

/* Step 3: Retrieve annotated methods using Reflection */
public class ImportantMethodExample {
    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod info = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method: " + method.getName() +", Importance Level: " + info.level());
            }
        }
    }
}
