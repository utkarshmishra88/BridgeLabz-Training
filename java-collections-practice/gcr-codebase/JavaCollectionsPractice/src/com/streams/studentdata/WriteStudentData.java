package com.streams.studentdata;
import java.io.*;

public class WriteStudentData {

    public static void main(String[] args) {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("student.dat"))) {

            dos.writeInt(101);              // roll number
            dos.writeUTF("Utkarsh");        // name
            dos.writeDouble(8.7);           // GPA

            dos.writeInt(102);
            dos.writeUTF("Amit");
            dos.writeDouble(8.2);

            System.out.println("Student data stored successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
