package com.multithreading.monitoringsystem;

public class TaskRunner extends Thread{

    public TaskRunner(String name){
        super(name);
    }

    @Override
    public void run(){

        try{
            Thread.sleep(2000);
            long sum=0;
            for(int i=0;i<5_000_000;i++)
                sum+=i;

        }catch(InterruptedException e){
            System.out.println(getName()+" interrupted");
        }

    }
}
