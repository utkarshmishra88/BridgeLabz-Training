package com.markerinterface.cloningprototypeobjects;
public class PrototypeApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        // original object (prototype)
        Vehicle v1 = new Vehicle("Tesla Model 3", 50000);

        // cloned objects
        Vehicle v2 = (Vehicle) v1.clone();
        Vehicle v3 = (Vehicle) v1.clone();

        System.out.println("Original: " + v1);
        System.out.println("Clone 1 : " + v2);
        System.out.println("Clone 2 : " + v3);
    }
}
