package com.trafficmanager;
class Roundabout {

    private Vehicle head = null;

    // Add vehicle to roundabout
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
            return;
        }

        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newVehicle;
        newVehicle.next = head;
    }

    // Remove vehicle from roundabout
    public void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Vehicle last = head;
                        while (last.next != head)
                            last = last.next;
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Vehicle exited: " + number);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
