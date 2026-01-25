package com.annotations;
import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        List list = new ArrayList();   // unchecked warning suppressed

        list.add("Java");
        list.add(100);

        System.out.println(list);
    }
}
