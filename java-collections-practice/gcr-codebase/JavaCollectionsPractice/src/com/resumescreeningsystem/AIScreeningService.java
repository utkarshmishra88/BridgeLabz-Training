package com.resumescreeningsystem;
class AIScreeningService {

    public static <T extends JobRole> void aiEvaluate(Resume<T> resume) {
        System.out.println("AI analyzing resume...");
        resume.processResume();
        System.out.println("AI screening completed.");
    }
}
