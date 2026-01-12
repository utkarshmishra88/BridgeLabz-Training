package com.ambulanceroute;
class CircularHospitalRoute {

    private HospitalUnit head = null;
    private HospitalUnit tail = null;

    // Add a hospital unit
    public void addUnit(String name, boolean isAvailable) {
        HospitalUnit unit = new HospitalUnit(name, isAvailable);

        if (head == null) {
            head = tail = unit;
            tail.next = head; // circular link
        } else {
            tail.next = unit;
            unit.next = head;
            tail = unit;
        }
    }

    // Rotate and find nearest available unit
    public void redirectPatient() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit temp = head;

        do {
            if (temp.isAvailable) {
                System.out.println("Patient sent to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units are busy!");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit current = head;
        HospitalUnit previous = tail;

        do {
            if (current.name.equals(unitName)) {

                // Only one unit
                if (head == tail) {
                    head = tail = null;
                } else {
                    previous.next = current.next;

                    if (current == head)
                        head = current.next;

                    if (current == tail)
                        tail = previous;
                }

                System.out.println(unitName + " removed (Maintenance)");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Unit not found");
    }

    // Display route
    public void showRoute() {
        if (head == null) {
            System.out.println("No units in route");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to " + head.name + ")");
    }
}
