package com.bookbazar;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final int orderId;
    private static int counter = 1000;

    private User user;
    private List<Book> books = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    private String status = "CREATED"; // restricted

    public Order(User user) {
        this.orderId = ++counter;
        this.user = user;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            books.add(book);
            quantities.add(quantity);
        } else {
            System.out.println("Insufficient stock for " + book.title);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < books.size(); i++) {
            total += books.get(i)
                    .applyDiscount(books.get(i).price, quantities.get(i));
        }
        return total;
    }

    // Controlled status update
    public void completeOrder() {
        status = "COMPLETED";
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User: " + user.getName());
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println("Status: " + status);
    }
}
