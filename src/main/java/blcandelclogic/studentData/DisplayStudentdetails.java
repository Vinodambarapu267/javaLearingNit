package blcandelclogic.studentData;

import java.util.Scanner;

public class DisplayStudentdetails {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a student roll :");
        int roll =Integer.parseInt(sc.nextLine());
        System.out.println("Enter a student Name:");
        String name = sc.nextLine();
        System.out.println("Enter a student Fee");
        float fee =Float.parseFloat(sc.nextLine());
        System.out.println("enter a gender :");
        char gender =sc.nextLine().toUpperCase().charAt(0);
        System.out.printf("student Details : %s",Studentsdetails.getStduentDetails(roll,name,fee,gender));
//        System.out.println(Studentsdetails.getStduentDetails(121,"Vinod",1200.2f,'m'));
//        System.out.println(Studentsdetails.getStduentDetails(122,"Ram",1200.21f,'f'));
    }
}
