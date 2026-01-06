package com.learningplatform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	private List<String> questions;        
    private final List<String> answers ;    
    private int score;
    private String difficulty;

  //Constructor with difficulty
  public Quiz(String difficulty) {
     this.difficulty = difficulty;
     this.questions = new ArrayList<>();
     this.answers = new ArrayList<>();
     loadQuestions();
  }

  //Internal questions (cannot be accessed directly)
  private void loadQuestions() {
    if (difficulty.equalsIgnoreCase("easy")) {
        questions.add("Java is platform independent? (yes/no)");
        answers.add("yes");

        questions.add("int size is 4 bytes? (yes/no)");
        answers.add("yes");
        
        questions.add("Java is an object-oriented language? (yes/no)");
        answers.add("yes");
    } else {
        questions.add("JVM stands for Java Virtual Machine? (yes/no)");
        answers.add("yes");

        questions.add("Java supports multiple inheritance using classes? (yes/no)");
        answers.add("no");
        
        questions.add("final keyword prevents inheritance? (yes/no)");
        answers.add("yes");
    }
 }
  
  public void evaluateQuiz(Scanner sc) {
      score = 0;

      for (int i = 0; i < questions.size(); i++) {
          System.out.println(questions.get(i));
          String userAnswer = sc.next();

          if (userAnswer.equalsIgnoreCase(answers.get(i))) {
              score++;
          }
      }
 }
  public double calculatePercentage() {
      return ((double) score / questions.size()) * 100;
  }

  public int getScore() {
      return score;
  }
}
