package com.multithreading.jobscheduler;

public class PrintJob implements Runnable{

    private Printer printer;
    private String job;
    private int pages;

    public PrintJob(Printer printer,String job,int pages){
        this.printer=printer;
        this.job=job;
        this.pages=pages;
    }

    @Override
    public void run(){

        String level="Medium Priority";
        int p=Thread.currentThread().getPriority();

        if(p>=8) level="High Priority";
        else if(p<=4) level="Low Priority";

        System.out.println("["+level+"] "+job+" started");

        printer.print(job,pages);
    }
}
