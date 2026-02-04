package com.multithreading.orderprocessing;

public class RestaurantApp{

    public static void main(String[] args) throws Exception{

        Chef c1=new Chef("Chef-1","Pizza",3000);
        Chef c2=new Chef("Chef-2","Pasta",2000);
        Chef c3=new Chef("Chef-3","Salad",1000);
        Chef c4=new Chef("Chef-4","Burger",2500);

        Chef[] chefs={c1,c2,c3,c4};

        // start all chefs
        for(Chef c:chefs)
            c.start();

        // manager waits
        for(Chef c:chefs)
            c.join();

        System.out.println("\nKitchen closed - All orders completed");
    }
}
