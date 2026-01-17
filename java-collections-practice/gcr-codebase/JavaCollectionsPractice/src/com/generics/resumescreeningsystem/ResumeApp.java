package com.generics.resumescreeningsystem;
import java.util.*;

public class ResumeApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Utkarsh", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Aman", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Neha", new ProductManager());

        // Generic method usage
        AIScreeningService.aiEvaluate(r1);
        AIScreeningService.aiEvaluate(r2);
        AIScreeningService.aiEvaluate(r3);

        // Wildcard pipeline
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processAll(roles);
    }
}
