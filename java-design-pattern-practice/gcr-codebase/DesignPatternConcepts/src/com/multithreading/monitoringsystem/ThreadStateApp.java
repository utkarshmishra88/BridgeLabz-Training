package com.multithreading.monitoringsystem;

public class ThreadStateApp{

    public static void main(String[] args) throws Exception{

        TaskRunner t1=new TaskRunner("Task-1");
        TaskRunner t2=new TaskRunner("Task-2");

        StateMonitor monitor=new StateMonitor(t1,t2);

        // NEW state visible here
        monitor.start();
        t1.start();
        t2.start();

        monitor.join(); // wait for monitoring to finish
    }
}
