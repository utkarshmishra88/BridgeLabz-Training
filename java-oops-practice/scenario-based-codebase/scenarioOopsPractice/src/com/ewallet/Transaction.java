package com.ewallet;
import java.time.LocalDateTime;

class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " | Amount: ₹" + amount + " | Time: " + timestamp;
    }
}
