package test.studentdetails;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Id: ");
        int id = sc.nextInt();
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        Student student = new Student(id,name,age);
        student.Display();
    }
}
