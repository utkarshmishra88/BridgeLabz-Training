package com.trafficmanager;
class WaitingQueue {

    private String[] queue;
    private int front = 0, rear = -1, size = 0;

    WaitingQueue(int capacity) {
        queue = new String[capacity];
    }

    public void enqueue(String vehicle) {
        if (size == queue.length) {
            System.out.println("Queue Overflow! Vehicle waiting outside.");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = vehicle;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return null;
        }
        String v = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return v;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
