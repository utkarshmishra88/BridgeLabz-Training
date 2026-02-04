package com.multithreading.jobscheduler;

public class PrintShopApp{

    public static void main(String[] args) throws Exception{

        Printer printer=new Printer();

        long start=System.currentTimeMillis();

        Thread j1=new Thread(new PrintJob(printer,"Job1",10));
        Thread j2=new Thread(new PrintJob(printer,"Job2",5));
        Thread j3=new Thread(new PrintJob(printer,"Job3",15));
        Thread j4=new Thread(new PrintJob(printer,"Job4",8));
        Thread j5=new Thread(new PrintJob(printer,"Job5",12));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        Thread[] jobs={j1,j2,j3,j4,j5};

        System.out.println("Starting print jobs...\n");

        for(Thread t:jobs)
        	t.start();
        for(Thread t:jobs)
        	t.join();

        long end=System.currentTimeMillis();

        System.out.println("All jobs completed in "+(end-start)+" ms");
    }
}
