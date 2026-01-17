package com.generics.coursemanagement;
import java.util.*;

public class UniversityApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<CourseType> courseList = new ArrayList<>();

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nSelect Course Type:");
            System.out.println("1. Exam Based");
            System.out.println("2. Assignment Based");
            System.out.println("3. Research Based");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            switch (choice) {
                case 1:
                    courseList.add(new ExamCourse(name));
                    break;

                case 2:
                    courseList.add(new AssignmentCourse(name));
                    break;

                case 3:
                    courseList.add(new ResearchCourse(name));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n--- University Course Evaluation ---");
        CourseManager.displayCourses(courseList);

        sc.close();
    }
}
