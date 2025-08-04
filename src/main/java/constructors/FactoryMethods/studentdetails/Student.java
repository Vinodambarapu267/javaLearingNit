package constructors.FactoryMethods.studentdetails;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String grade;

    private Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public  static Student createStudentObj(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Student Name: ");
        String name = sc.next();
        System.out.println("Enter a Student Age: ");
        int age = sc.nextInt();
        System.out.println("Enter a Student Grade");
        String grade = sc.next();
        return new Student(name,age,grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
