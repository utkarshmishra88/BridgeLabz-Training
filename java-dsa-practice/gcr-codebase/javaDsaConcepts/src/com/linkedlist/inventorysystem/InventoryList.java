package com.linkedlist.inventorysystem;

class InventoryList {

    private Item head;

    // 1️⃣ Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        newItem.next = head;
        head = newItem;
    }

    // 2️⃣ Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);

        if (head == null) {
            head = newItem;
            return;
        }

        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // 3️⃣ Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Item newItem = new Item(id, name, qty, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // 4️⃣ Remove item by ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // 5️⃣ Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // 6️⃣ Search by ID or Name
    public void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchByName(String name) {
        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // 7️⃣ Calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        Item temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: ₹" + total);
    }

    // 8️⃣ Sort inventory (Merge Sort)
    public void sortByName(boolean ascending) {
        head = mergeSort(head, (a, b) ->
                ascending ? a.itemName.compareToIgnoreCase(b.itemName)
                          : b.itemName.compareToIgnoreCase(a.itemName));
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, (a, b) ->
                ascending ? Double.compare(a.price, b.price)
                          : Double.compare(b.price, a.price));
    }

    // 🔹 Merge Sort Helper
    private Item mergeSort(Item h, java.util.Comparator<Item> comp) {
        if (h == null || h.next == null) return h;

        Item mid = getMiddle(h);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSort(h, comp);
        Item right = mergeSort(nextMid, comp);

        return merge(left, right, comp);
    }

    private Item merge(Item a, Item b, java.util.Comparator<Item> comp) {
        if (a == null) return b;
        if (b == null) return a;

        Item result;
        if (comp.compare(a, b) <= 0) {
            result = a;
            result.next = merge(a.next, b, comp);
        } else {
            result = b;
            result.next = merge(a, b.next, comp);
        }
        return result;
    }

    private Item getMiddle(Item h) {
        Item slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 9️⃣ Display inventory
    public void displayAll() {
        Item temp = head;

        if (temp == null) {
            System.out.println("Inventory empty");
            return;
        }

        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(Item i) {
        System.out.println(
                "ID: " + i.itemId +
                ", Name: " + i.itemName +
                ", Qty: " + i.quantity +
                ", Price: ₹" + i.price
        );
    }
}

