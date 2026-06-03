package org.csystem.app.grade;

import java.util.Scanner;

public class StudentGradeApp {
    public static void printStudentInfo(StudentInfo studentInfo)
    {
        System.out.println("Student Information:");
        System.out.printf("Number: %s%n", studentInfo.studentNumber);
        System.out.printf("Name: %s%n", studentInfo.studentName);
        System.out.printf("Birth Date: %s%n", studentInfo.studentBirthDateStr);
        System.out.printf("Lecture Name: %s%n", studentInfo.lectureName);
        System.out.printf("Midterm Grade: %d%n", studentInfo.midtermGrade);
        System.out.printf("Final Grade: %d%n", studentInfo.finalGrade);

        double grade = studentInfo.getGrade();

        System.out.printf("Grade: %.1f%n", grade);
        System.out.printf("Status: %s%n", grade >= 50 ? "Success" : "Failure");
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input student info pattern in '<student number>:<full name>:<birth date (yyyy-mm-dd)>:<lecture name>:<midterm grade>:<final grade>' format:");
        String str = kb.nextLine();

        StudentInfo studentInfo = StudentInfo.of(str);

        printStudentInfo(studentInfo);
    }

    public static void main(String [] args)
    {
        run();
    }
}
