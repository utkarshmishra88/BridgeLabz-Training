package com.multithreading.monitoringsystem;

import java.time.LocalTime;
import java.util.*;

public class StateMonitor extends Thread{

    private Thread[] tasks;
    private Map<String,Set<Thread.State>> history=new HashMap<>();

    public StateMonitor(Thread... tasks){
        super("Monitor");
        this.tasks=tasks;
    }

    @Override
    public void run(){

        boolean running=true;

        while(running){
            running=false;

            for(Thread t:tasks){

                Thread.State state=t.getState();
                history.putIfAbsent(t.getName(),new HashSet<>());
                history.get(t.getName()).add(state);

                System.out.println("[Monitor] "+t.getName()+" is in "
                        +state+" at "+LocalTime.now());

                if(state!=Thread.State.TERMINATED)
                    running=true;
            }

            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

        // summary
        System.out.println("\nSummary:");
        for(String name:history.keySet())
            System.out.println(name+" went through "+history.get(name).size()+" states");
    }
}
