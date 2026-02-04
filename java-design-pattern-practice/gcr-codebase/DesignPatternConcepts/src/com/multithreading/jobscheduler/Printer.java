package com.multithreading.jobscheduler;

public class Printer{

    public synchronized void print(String job,int pages){
        for(int i=1;i<=pages;i++){
            System.out.println("Printing "+job+" - Page "+i+" of "+pages);
            try{
            	Thread.sleep(100);
            }
            catch(Exception e){}
        }

        System.out.println(job+" completed\n");
    }
}
