package com.streams.studentdata;
import java.io.*;

public class ReadStudentData {

    public static void main(String[] args) {

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream("student.dat"))) {

            while (true) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(
                        "Roll: " + roll +
                        ", Name: " + name +
                        ", GPA: " + gpa
                );
            }

        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
