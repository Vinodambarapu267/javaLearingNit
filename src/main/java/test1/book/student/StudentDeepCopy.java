package test1.book.student;

import java.util.Scanner;

public class StudentDeepCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Student student = new Student(name,age);
       student.display();


       Student stu = new Student(student);
        stu.display();


    }

}
