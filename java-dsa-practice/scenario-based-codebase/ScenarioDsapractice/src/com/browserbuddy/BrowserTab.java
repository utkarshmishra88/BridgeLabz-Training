package com.browserbuddy;

class BrowserTab {
    private PageNode head;
    private PageNode current;

    // Visit a new page
    public void visit(String url) {
        PageNode newNode = new PageNode(url);

        if (head == null) {
            head = newNode;
            current = newNode;
            return;
        }

        // Clear forward history
        current.next = null;

        newNode.prev = current;
        current.next = newNode;
        current = newNode;
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No previous page");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No next page");
        }
    }

    // Get current page
    public String getCurrentPage() {
        return current != null ? current.url : "No page";
    }

    // Display history
    public void showHistory() {
        PageNode temp = head;
        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.url + "] ");
            } else {
                System.out.print(temp.url + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
