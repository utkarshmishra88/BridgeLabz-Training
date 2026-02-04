package com.multithreading.downloadmanager.usingRunnableInterface;

import java.util.Random;

// Runnable interface approach (best practice)
public class FileDownloaderRunnable implements Runnable{

    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run(){

    	for(int i=0;i<=100;i+=10){
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading "+ fileName + ": " + i + "%");
            try {
                Thread.sleep(random.nextInt(300)); // random delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] " + fileName + " Download Complete!");
    }
}