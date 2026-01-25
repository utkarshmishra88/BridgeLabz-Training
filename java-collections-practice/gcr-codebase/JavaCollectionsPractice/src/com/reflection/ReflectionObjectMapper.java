package com.reflection;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectionObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

        // Create object dynamically
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Set fields from map
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }

    // ONLY for execution (not a domain example)
    static class Model {
        int id;
        String name;

        public String toString() {
            return id + " " + name;
        }
    }

    public static void main(String[] args) throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 10);
        data.put("name", "Emma");

        Object obj = toObject(Model.class, data);
        System.out.println(obj);
    }
}
