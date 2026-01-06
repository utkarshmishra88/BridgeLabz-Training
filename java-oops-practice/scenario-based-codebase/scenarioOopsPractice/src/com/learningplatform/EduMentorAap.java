package com.learningplatform;

import java.util.Scanner;

public class EduMentorAap {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.println("Enter Learner ID:");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.println("Enter Learner Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Course Type:");
        System.out.println("1. Part-Time");
        System.out.println("2. Full-Time");
        int courseType = sc.nextInt();

        // Create Learner
        Learner learner = new Learner(id, name, email, courseType);

        System.out.println("\nChoose Quiz Difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Hard");
        int diffChoice = sc.nextInt();

        String difficulty = (diffChoice == 1) ? "easy" : "hard";
        Quiz quiz = new Quiz(difficulty);

        System.out.println("\n--- Quiz Started ---");
        quiz.evaluateQuiz(sc);

        double percentage = quiz.calculatePercentage();
        learner.setPercentage(percentage);

        System.out.println("\nQuiz Score: " + quiz.getScore());
        System.out.println("Percentage: " + percentage + "%");

        // Polymorphism in action
        learner.generateCertificate();

        sc.close();
	}

}
