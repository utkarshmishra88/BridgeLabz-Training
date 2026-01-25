package com.reflection;
import java.lang.reflect.Field;

class Data {
    private int id = 101;
    private String name = "Emma";
    private boolean active = true;
}

public class ReflectionJsonGenerator {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);

            json.append("\"")
                .append(f.getName())
                .append("\": ");

            Object value = f.get(obj);

            if (value instanceof String)
                json.append("\"").append(value).append("\"");
            else
                json.append(value);

            if (i < fields.length - 1)
                json.append(", ");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        Data d = new Data();
        System.out.println(toJson(d));
    }
}
