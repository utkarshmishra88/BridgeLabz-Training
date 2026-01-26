package com.resumeanalyzer;
import java.io.*;
import java.util.*;

public class ResumeAnalyzer {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-collections-practice\\scenario-based-codebase\\ScenarioColletionsPractice\\src\\com\\resumeanalyzer\\resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> candidateList = new ArrayList<>();

        for (File file : folder.listFiles()) {
            try {
                ResumeData data = ResumeReader.processResume(file);
                resumeMap.put(data.getEmail(), data);
                candidateList.add(data);
            } catch (InvalidResumeFormatException | IOException e) {
                System.out.println("Skipped: " + e.getMessage());
            }
        }

        // Sort candidates by keyword match count (descending)
        candidateList.sort(
            (a, b) -> Integer.compare(b.getKeywordCount(), a.getKeywordCount())
        );

        System.out.println("=== Shortlisted Candidates ===");
        candidateList.forEach(System.out::println);
    }
}
