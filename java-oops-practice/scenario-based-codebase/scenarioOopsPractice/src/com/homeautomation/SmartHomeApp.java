package com.homeautomation;

public class SmartHomeApp {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        System.out.println();
        controller.compareEnergy(fan, ac);

        controller.operateDevice(ac, false);
    }
}

