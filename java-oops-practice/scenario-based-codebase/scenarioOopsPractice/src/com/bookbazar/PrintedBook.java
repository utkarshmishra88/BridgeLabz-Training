package com.bookbazar;
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price, int quantity) {
        double total = price * quantity;
        return total - 50; // flat ₹50 discount
    }

    @Override
    public String getBookType() {
        return "Printed Book";
    }
}
