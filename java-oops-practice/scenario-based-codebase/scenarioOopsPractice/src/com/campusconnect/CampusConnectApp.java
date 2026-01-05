package com.campusconnect;
import java.util.Scanner;

public class CampusConnectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty input
        System.out.println("Enter Faculty ID:");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty Department:");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course input
        System.out.println("\nEnter Course ID:");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course Name:");
        String cname = sc.nextLine();

        Course course = new Course(cid, cname, faculty);

        // Student input
        System.out.println("\nEnter Student ID:");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String sname = sc.nextLine();

        System.out.println("Enter Student Email:");
        String semail = sc.nextLine();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            grades[i] = sc.nextDouble();
        }

        Student student = new Student(sid, sname, semail, grades);

        // Enrollment
        student.enrollCourse(course);

        // Output
        System.out.println("\n--- Student Details ---");
        student.printDetails();

        System.out.println("\n--- Faculty Details ---");
        faculty.printDetails();

        System.out.println("\n--- Course Details ---");
        course.printCourseDetails();

        sc.close();
    }
}
