package com.functionalinterface;

public class BackgroundJobExecution{

    public static void main(String[] args){

    	// Define a background job
        Runnable job = () -> {
            System.out.println("Background job started");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Background job completed");
        };

        // Execute the job in a separate thread
        Thread workerThread = new Thread(job);
        workerThread.start();

        System.out.println("Main thread continues execution");
    }
}
