package com.reflection;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Apply annotation to class
@Author(name = "Author Name")
class Book {
}

// Reflection to read annotation
public class ReflectionAnnotationExample {
    public static void main(String[] args) {

        Class<Book> cls = Book.class;

        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}
