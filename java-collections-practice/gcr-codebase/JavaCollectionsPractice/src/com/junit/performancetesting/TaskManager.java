package com.junit.performancetesting;
public class TaskManager {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);   // 3 seconds
        return "Task Completed";
    }
}
