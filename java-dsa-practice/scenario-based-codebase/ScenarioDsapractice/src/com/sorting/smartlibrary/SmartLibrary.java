package com.sorting.smartlibrary;
import java.util.*;

public class SmartLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            books.add(new Book(sc.nextLine()));
        }

        // insertion sort by title
        for (int i = 1; i < books.size(); i++) {
            Book key = books.get(i);
            int j = i - 1;

            while (j >= 0 && books.get(j).title.compareTo(key.title) > 0) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, key);
        }

        // sorted book list
        System.out.println("Sorted Borrowed Books:");
        for (Book b : books)
            System.out.println(b.title);
    }
}    