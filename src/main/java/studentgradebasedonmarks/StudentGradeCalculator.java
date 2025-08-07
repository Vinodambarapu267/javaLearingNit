package studentgradebasedonmarks;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Student Name:");
        String  name = sc.next();
        System.out.println("Enter a Student Marks");
        int marks = sc.nextInt();
        Student student =new Student(name,marks);

        StudentGrade grade = CalculateStudentGrade.calculateGrade(student);
        System.out.println(grade);
    }
}
