package com.bookbazar;
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price, int quantity) {
        double total = price * quantity;
        return total - (total * 0.10); // 10% discount
    }

    @Override
    public String getBookType() {
        return "E-Book";
    }
}
