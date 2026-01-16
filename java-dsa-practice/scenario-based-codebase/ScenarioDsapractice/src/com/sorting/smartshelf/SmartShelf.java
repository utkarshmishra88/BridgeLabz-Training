package com.sorting.smartshelf;
import java.util.Scanner;

public class SmartShelf {

    // Insertion Sort by book title (A → Z)
    static void insertionSort(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;
            // Shift books with titles greater than key
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            books[i] = new Book(title);
        }

        insertionSort(books);
        System.out.println("\nBooks sorted alphabetically:");
        for (Book b : books) {
            System.out.println(b.title);
        }
        sc.close();
    }
}
