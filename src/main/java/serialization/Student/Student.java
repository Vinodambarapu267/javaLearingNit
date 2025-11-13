package serialization.Student;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable {
    private int studentId;
    private String studentName;
    private Double studentFee;
    private static LocalDate dataOfAdmission;

   public Student(int studentId, String studentName, Double studentFee, LocalDate dataOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFee = studentFee;
        this.dataOfAdmission = dataOfAdmission;

    }

    public static Student getStudentObject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the fee ");
        double fee = Double.parseDouble(sc.nextLine());
       LocalDate today = LocalDate.now();
        Student student = new Student(id, name, fee,today );
        return student;

    }
    @Override
    public String toString() {
        return STR."Student{studentId=\{studentId}, studentName='\{studentName}', studentFee=\{studentFee}, dataOfAdmission=\{dataOfAdmission}}";
    }
}
