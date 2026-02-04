package com.multithreading.downloadmanager.usingThreadClassApproach;

import java.util.Random;

//Thread class approach
public class FileDownloaderThread extends Thread{

    private String fileName;
    private Random random = new Random();

    public FileDownloaderThread(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run(){

        for(int i=0;i<=100;i+=10){
            System.out.println("[" + getName() + "] Downloading "+ fileName + ": " + i + "%");
            try {
                Thread.sleep(random.nextInt(300)); // random delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("[" + getName() + "] " + fileName + " Download Complete!");
    }
}