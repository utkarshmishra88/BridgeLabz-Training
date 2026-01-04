package com.hashmap.hashmapimplementation;

class MyHashMap {

    // Node class for linked list
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 10;                 // bucket size
    private Node[] buckets = new Node[SIZE];

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update
    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];

        // Check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value; // update
                return;
            }
            head = head.next;
        }

        // Insert at beginning
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Retrieve value
    public Integer get(int key) {
        int index = hash(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return null; // not found
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}