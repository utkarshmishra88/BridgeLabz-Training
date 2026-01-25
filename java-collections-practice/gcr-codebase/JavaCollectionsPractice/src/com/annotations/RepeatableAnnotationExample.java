package com.annotations;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* Step 1: Container annotation */
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

/* Step 2: Repeatable annotation */
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@interface BugReport {
    String description();
}

/* Step 3: Apply annotation multiple times */
class Software {

    @BugReport(description = "NullPointerException on startup")
    @BugReport(description = "UI not responsive on login")
    public void runApp() {
        System.out.println("Application running");
    }
}

/* Step 4: Retrieve repeatable annotations */
public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {

        Class<Software> cls = Software.class;
        Method method = cls.getDeclaredMethod("runApp");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
