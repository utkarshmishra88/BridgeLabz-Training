package com.reflection;
import java.lang.reflect.Field;

class Configuration {

    private static String API_KEY = "OLD_KEY";

    public static void showKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

public class ReflectionStaticFieldExample {
    public static void main(String[] args) throws Exception {

        // Before modification
        Configuration.showKey();

        // Get Class object
        Class<?> cls = Configuration.class;

        // Get private static field
        Field apiKeyField = cls.getDeclaredField("API_KEY");

        // Allow access to private field
        apiKeyField.setAccessible(true);

        // Modify static field (no object needed)
        apiKeyField.set(null, "NEW_API_KEY");

        // After modification
        Configuration.showKey();
    }
}
