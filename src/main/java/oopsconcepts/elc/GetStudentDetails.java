package oopsconcepts.elc;


import oopsconcepts.blc.Student;

import java.util.Scanner;

//elc
public class GetStudentDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter id");
        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter marks");
        int marks = Integer.parseInt(sc.nextLine());
        Student student1 = new Student();
        student1.setStudentData(id,marks,name);
        student1.calculate();
        System.out.println(student1);
    }
}
