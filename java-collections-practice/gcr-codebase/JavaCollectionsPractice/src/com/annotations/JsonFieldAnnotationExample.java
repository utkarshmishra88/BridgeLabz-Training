package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

/* Step 1: Define custom annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();   // custom JSON key
}

/* Step 2: Apply annotation to a normal class */
class DataModel {

    @JsonField(name = "emp_name")
    private String name;

    @JsonField(name = "emp_id")
    private int id;

    private String secret;   // not serialized

    public DataModel(String name, int id, String secret) {
        this.name = name;
        this.id = id;
        this.secret = secret;
    }
}

/* Step 3: JSON generator using Reflection */
public class JsonFieldAnnotationExample {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");
        boolean first = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                if (!first) json.append(", ");

                json.append("\"")
                    .append(jf.name())
                    .append("\": ");

                Object value = field.get(obj);

                if (value instanceof String)
                    json.append("\"").append(value).append("\"");
                else
                    json.append(value);

                first = false;
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        DataModel data = new DataModel("Emma", 101, "hidden");
        System.out.println(toJson(data));
    }
}

