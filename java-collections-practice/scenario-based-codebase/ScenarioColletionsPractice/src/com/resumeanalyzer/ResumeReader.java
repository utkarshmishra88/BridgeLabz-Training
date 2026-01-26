package com.resumeanalyzer;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class ResumeReader {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    private static final Pattern SKILL_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    public static ResumeData processResume(File file)
            throws IOException, InvalidResumeFormatException {

        if (!(file.getName().endsWith(".txt") || file.getName().endsWith(".pdf"))) {
            throw new InvalidResumeFormatException("Unsupported format: " + file.getName());
        }

        String content = Files.readString(file.toPath());

        Matcher emailMatcher = EMAIL_PATTERN.matcher(content);
        Matcher phoneMatcher = PHONE_PATTERN.matcher(content);
        Matcher skillMatcher = SKILL_PATTERN.matcher(content);

        if (!emailMatcher.find()) {
            throw new InvalidResumeFormatException("Email not found in " + file.getName());
        }

        String email = emailMatcher.group();
        String phone = phoneMatcher.find() ? phoneMatcher.group() : "Not Available";

        Set<String> skills = new HashSet<>();
        while (skillMatcher.find()) {
            skills.add(skillMatcher.group());
        }

        return new ResumeData(email, phone, skills);
    }
}
