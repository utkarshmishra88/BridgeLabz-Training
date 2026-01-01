package com.inheritance.ordermanagement;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
