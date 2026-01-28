package com.lambdaexpression.lightingautomation;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {

    public static void main(String[] args) {

        // Map to store trigger → behavior
        Map<String, LightAction> triggers = new HashMap<>();

        // Motion sensor trigger
        triggers.put("MOTION", () -> System.out.println("Motion detected → Bright white lights ON"));

        // Time-based trigger
        triggers.put("NIGHT", () -> System.out.println("Night time → Dim warm lights ON"));

        // Voice command trigger
        triggers.put("VOICE", () -> System.out.println("Voice command → Party mode lights ON"));

        // Simulate triggers
        activateLight("MOTION", triggers);
        activateLight("NIGHT", triggers);
        activateLight("VOICE", triggers);
    }

    static void activateLight(String trigger, Map<String, LightAction> triggers) {
        LightAction action = triggers.get(trigger);
        if (action != null) {
            action.activate();
        } else {
            System.out.println("No lighting rule for trigger: " + trigger);
        }
    }
}