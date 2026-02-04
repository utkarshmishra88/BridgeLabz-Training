package com.multithreading.bankingsystem;

public class BankingApp {

    public static void main(String[] args) throws Exception {

        BankAccount account=new BankAccount();

        Thread t1=new Thread(new Transaction(account,"Customer-1",3000),"Customer-1");
        Thread t2=new Thread(new Transaction(account,"Customer-2",4000),"Customer-2");
        Thread t3=new Thread(new Transaction(account,"Customer-3",2000),"Customer-3");
        Thread t4=new Thread(new Transaction(account,"Customer-4",5000),"Customer-4");
        Thread t5=new Thread(new Transaction(account,"Customer-5",1500),"Customer-5");

        Thread[] arr={t1,t2,t3,t4,t5};

        for(Thread t:arr)
            System.out.println(t.getName()+" state: "+t.getState());

        for(Thread t:arr)
            t.start();

        for(Thread t:arr)
            t.join();

        System.out.println("\nFinal Balance: "+account.getBalance());
        System.out.println("All transactions completed!");
    }
}
