package com.stacksandqueues.queueusingstack;

public class QueueUsingStacksDriver {
	public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);
        System.out.println(q.dequeue()); // 30
        System.out.println(q.peek());    // 40
    }
}
