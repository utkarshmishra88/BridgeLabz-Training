package com.linkedlist.taskscheduler;

public class TaskSchedulerApp {
    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Design Module", 2, "10-Feb");
        scheduler.addAtEnd(2, "Code Review", 1, "11-Feb");
        scheduler.addAtBeginning(3, "Requirement Analysis", 3, "08-Feb");
        scheduler.addAtPosition(2, 4, "Testing", 2, "12-Feb");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nCurrent Task Cycle:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(2);

        System.out.println("\nRemove Task:");
        scheduler.removeById(2);

        System.out.println("\nFinal Task List:");
        scheduler.displayAll();
    }
}
