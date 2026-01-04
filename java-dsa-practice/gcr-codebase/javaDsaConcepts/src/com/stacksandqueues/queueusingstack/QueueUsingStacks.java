package com.stacksandqueues.queueusingstack;
import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> stackEnq = new Stack<>();
    Stack<Integer> stackDeq = new Stack<>();

    // Enqueue operation
    void enqueue(int x) {
        stackEnq.push(x);
    }

    // Dequeue operation
    int dequeue() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        if (stackDeq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDeq.pop();
    }

    // Display front element
    int peek() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.isEmpty() ? -1 : stackDeq.peek();
    }
}
