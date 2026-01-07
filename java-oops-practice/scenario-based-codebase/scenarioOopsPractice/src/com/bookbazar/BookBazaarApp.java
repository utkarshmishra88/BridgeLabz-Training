package com.bookbazar;
public class BookBazaarApp {

    public static void main(String[] args) {

        User user = new User("Utkarsh", "utkarsh@gmail.com");

        Book b1 = new EBook("Java Basics", "James", 500, 10);
        Book b2 = new PrintedBook("Spring Boot", "Rod", 700, 5);

        Order order = new Order(user);

        order.addBook(b1, 2);
        order.addBook(b2, 1);

        order.completeOrder();
        order.showOrder();
    }
}
