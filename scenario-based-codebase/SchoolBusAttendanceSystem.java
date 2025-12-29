//Java program for school bus attendance.
import java.util.Scanner;

public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {

        String[] students = {"Amit", "Riya", "Rahul", "Neha", "Sohan", "Pooja", "Karan", "Anjali", "Vikram", "Sneha"};
        int presentCount = 0;
        int absentCount = 0;

        Scanner scanner = new Scanner(System.in);
        // For-each loop 
        for (String student : students) {
            System.out.print("Is " + student + " Present or Absent? (P/A): ");
            char status = scanner.next().toUpperCase().charAt(0);
            if (status == 'P') {
                presentCount++;
            } else if (status == 'A') {
                absentCount++;
            } else {
                System.out.println("Invalid input! Marked as Absent.");
                absentCount++;
            }
        }

        // Display final attendance report
        System.out.println("\n------ Attendance Summary ------");
        System.out.println("Total Students : " + students.length);
        System.out.println("Present        : " + presentCount);
        System.out.println("Absent         : " + absentCount);

        scanner.close();
    }
}
