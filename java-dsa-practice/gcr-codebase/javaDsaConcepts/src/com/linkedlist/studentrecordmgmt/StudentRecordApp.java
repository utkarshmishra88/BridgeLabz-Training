package com.linkedlist.studentrecordmgmt;

public class StudentRecordApp {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Utkarsh", 21, 'A');
        list.addAtEnd(102, "Aman", 20, 'B');
        list.addAtPosition(2, 103, "Riya", 22, 'A');

        System.out.println("All Students:");
        list.display();

        System.out.println("\nSearching Roll 102:");
        list.search(102);

        System.out.println("\nUpdating Grade:");
        list.updateGrade(103, 'A');

        System.out.println("\nDeleting Roll 101:");
        list.deleteByRoll(101);

        System.out.println("\nFinal List:");
        list.display();
    }
}

