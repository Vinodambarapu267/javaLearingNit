package constructors.FactoryMethods.studentdetails;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number of Student");
        int nObj = sc.nextInt();
        for (int i=0;i<nObj;i++){
            Student student1 = Student.createStudentObj();
            System.out.println(student1);
        }
    }
}
