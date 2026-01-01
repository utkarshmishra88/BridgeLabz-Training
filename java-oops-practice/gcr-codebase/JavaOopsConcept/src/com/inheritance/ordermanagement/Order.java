package com.inheritance.ordermanagement;

class Order {
    protected int orderId;
    protected String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrder() {
        System.out.println("Order ID    : " + orderId);
        System.out.println("Order Date  : " + orderDate);
        System.out.println("Status      : " + getOrderStatus());
    }
}
