package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

/* Step 1: Define @Todo annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();                 // description of task
    String assignedTo();           // developer name
    String priority() default "MEDIUM";  // default priority
}

/* Step 2: Apply annotation to multiple methods */
class ProjectTasks {

    @Todo(
        task = "Implement login feature",
        assignedTo = "Alice",
        priority = "HIGH"
    )
    public void loginFeature() {
    }

    @Todo(
        task = "Add payment integration",
        assignedTo = "Bob"
    )
    public void paymentFeature() {
    }

    @Todo(
        task = "Improve UI design",
        assignedTo = "Charlie",
        priority = "LOW"
    )
    public void uiImprovement() {
    }
}

/* Step 3: Retrieve and print pending tasks using Reflection */
public class TodoAnnotationExample {
    public static void main(String[] args) {

        Class<ProjectTasks> cls = ProjectTasks.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("-------------------------");
            }
        }
    }
}
