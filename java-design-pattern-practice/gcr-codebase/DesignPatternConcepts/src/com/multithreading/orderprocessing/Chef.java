package com.multithreading.orderprocessing;

public class Chef extends Thread{

    private String dish;
    private int time; //total cooking time

    public Chef(String name,String dish,int time){
        super(name); //thread name
        this.dish=dish;
        this.time=time;
    }

    @Override
    public void run(){

        System.out.println(getName()+" started preparing "+dish);
        int step=time/4; // 25% steps
        try{
            for(int i=1;i<=4;i++){
                Thread.sleep(step);
                System.out.println(getName()+" preparing "+dish+": "+(i*25)+"% complete");
            }
        }catch(Exception e){}

        System.out.println(getName()+" completed "+dish);
    }
}
