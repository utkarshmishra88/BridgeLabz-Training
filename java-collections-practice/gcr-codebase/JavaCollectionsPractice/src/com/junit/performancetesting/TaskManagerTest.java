package com.junit.performancetesting;
import org.junit.Test;

public class TaskManagerTest {

    TaskManager manager = new TaskManager();

    @Test(timeout = 2000)   // 2 seconds
    public void testLongRunningTaskPerformance() throws InterruptedException {
        manager.longRunningTask();
    }
}
