package com.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

/* Step 1: Define field-level annotation */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();   // maximum allowed length
}

/* Step 2: Apply annotation to field */
class User {

    @MaxLength(10)
    private String username;

    // Step 3: Validate length in constructor
    public User(String username) {

        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                    "Username length exceeds " + maxLength.value()
                );
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

/* Step 4: Test validation */
public class MaxLengthAnnotationExample {
    public static void main(String[] args) {

        User u1 = new User("Emma");           // valid
        System.out.println(u1.getUsername());

        User u2 = new User("VeryLongUsername");  // exception
        System.out.println(u2.getUsername());
    }
}
