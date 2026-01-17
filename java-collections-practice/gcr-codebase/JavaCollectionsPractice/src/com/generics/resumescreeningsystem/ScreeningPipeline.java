package com.generics.resumescreeningsystem;
import java.util.List;

class ScreeningPipeline {

    public static void processAll(List<? extends JobRole> roles) {
        System.out.println("\n--- Screening Pipeline ---");
        for (JobRole role : roles) {
            System.out.println("Pipeline screening for: " + role.getRoleName());
            role.screenResume();
        }
    }
}
