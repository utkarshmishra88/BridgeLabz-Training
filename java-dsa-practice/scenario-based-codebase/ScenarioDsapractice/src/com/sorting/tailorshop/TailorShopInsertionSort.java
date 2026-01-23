package com.sorting.tailorshop;
public class TailorShopInsertionSort {

    // Insertion Sort based on deadline
    static void insertionSort(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];	
            int j = i - 1;

            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    static void display(Order[] orders) {
        for (Order o : orders) {
            System.out.println("OrderID: " + o.orderId + ", Deadline: " + o.deadline);
        }
    }

    public static void main(String[] args) {
        
        Order[] orders = {
            new Order(101, 5),
            new Order(102, 2),
            new Order(103, 8),
            new Order(104, 3),
            new Order(105, 6)
        };

        insertionSort(orders);

        display(orders);
    }
}