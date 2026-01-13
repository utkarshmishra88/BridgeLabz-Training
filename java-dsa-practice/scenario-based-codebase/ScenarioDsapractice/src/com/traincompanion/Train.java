package com.traincompanion;

public class Train {
    private Compartment head;
    private Compartment tail;
    
    // Add compartment at end
    public void addCompartment(String name, String service) {
        Compartment newCompartment = new Compartment(name, service);

        if (head == null) {
            head = tail = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
        System.out.println(name + " added.");
    }

    // Traverse forward
    public void traverseForward() {
        Compartment temp = head;
        System.out.println("\nForward Traversal:");
        while (temp != null) {
            System.out.println(temp.name + " - " + temp.service);
            temp = temp.next;
        }
    }

    // Traverse backward
    public void traverseBackward() {
        Compartment temp = tail;
        System.out.println("\nBackward Traversal:");
        while (temp != null) {
            System.out.println(temp.name + " - " + temp.service);
            temp = temp.prev;
        }
    }

    // Search for a service
    public void searchService(String service) {
        Compartment temp = head;
        while (temp != null) {
            if (temp.service.equalsIgnoreCase(service)) {
                System.out.println("\nService '" + service + "' found in: " + temp.name);
                displayAdjacent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\nService not found.");
    }

    // Display adjacent compartments
    private void displayAdjacent(Compartment c) {
        System.out.println("Previous: " +
                (c.prev != null ? c.prev.name : "None"));
        System.out.println("Current: " + c.name);
        System.out.println("Next: " +
                (c.next != null ? c.next.name : "None"));
    }

    // Remove compartment by name
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println(name + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }
}
    

