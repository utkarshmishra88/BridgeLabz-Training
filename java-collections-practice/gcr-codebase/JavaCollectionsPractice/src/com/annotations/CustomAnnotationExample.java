package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* Step 1: Define custom annotation */
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

/* Step 2: Apply annotation to a method */
class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Emma")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

/* Step 3: Retrieve annotation using Reflection */
public class CustomAnnotationExample {
    public static void main(String[] args) throws Exception {

        Class<TaskManager> cls = TaskManager.class;

        Method method = cls.getDeclaredMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }
    }
}
