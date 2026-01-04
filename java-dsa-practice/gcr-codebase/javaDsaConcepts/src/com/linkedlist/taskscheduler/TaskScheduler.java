package com.linkedlist.taskscheduler;

class TaskScheduler {

    private Task head;
    private Task current; // points to current task

    // 1️⃣ Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newTask.next = head;
        temp.next = newTask;
        head = newTask;
    }

    // 2️⃣ Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = head;
    }

    // 3️⃣ Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // 4️⃣ Remove task by Task ID
    public void removeById(int id) {
        if (head == null) return;

        Task curr = head;
        Task prev = null;

        do {
            if (curr.taskId == id) {

                if (curr == head) {
                    Task temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                    current = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Task removed successfully");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    // 5️⃣ View current task & move to next
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // 6️⃣ Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks scheduled");
            return;
        }

        Task temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 7️⃣ Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Helper method
    private void displayTask(Task t) {
        System.out.println(
                "ID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due: " + t.dueDate
        );
    }
}

