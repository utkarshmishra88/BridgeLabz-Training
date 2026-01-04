package com.linkedlist.studentrecordmgmt;

class StudentLinkedList {

    private Student head;

    // 1️⃣ Add at beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        Student newNode = new Student(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // 2️⃣ Add at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        Student newNode = new Student(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3️⃣ Add at specific position (1-based index)
    public void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Student newNode = new Student(roll, name, age, grade);
        Student temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4️⃣ Delete by Roll Number
    public void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.rollNo == roll) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // 5️⃣ Search by Roll Number
    public void search(int roll) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Found: " + temp.rollNo + " " +
                        temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 6️⃣ Update grade by Roll Number
    public void updateGrade(int roll, char newGrade) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 7️⃣ Display all records
    public void display() {
        Student temp = head;

        if (temp == null) {
            System.out.println("No records found");
            return;
        }

        while (temp != null) {
            System.out.println(
                    "Roll: " + temp.rollNo +
                    ", Name: " + temp.name +
                    ", Age: " + temp.age +
                    ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}

