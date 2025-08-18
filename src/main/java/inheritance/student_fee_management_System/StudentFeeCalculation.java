package inheritance.student_fee_management_System;

import java.util.Scanner;

public class StudentFeeCalculation {
    public static void main(String[] args) {
        System.out.println("select a particular type of student");
        System.out.println("1. Hosteller Student ");
        System.out.println("2. DayScholar Student");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        System.out.println("Enter Student Id: ");
        int id =scanner.nextInt();
        System.out.println("Enter Student Name: ");
        String name = scanner.next();
        System.out.println("enter Exam fee: ");
        double examFee= scanner.nextDouble();
        switch (selection){
            case 1->{

                System.out.println("Enter a hostel Fee: ");
                double hostelFee =scanner.nextDouble();
                System.out.println("Enter a total Fee");
                double totalFee = scanner.nextDouble();
                System.out.println("You have selected Hosteller!!!");
                Hosteller hosteller = new Hosteller(id,name,examFee,hostelFee);
                hosteller.payFee(totalFee);
                System.out.println(hosteller);
            }
            case 2->{
                System.out.println("Enter a Transport Fee: ");
                double transportFee = scanner.nextDouble();
                System.out.println("Enter a total Amount: ");
                double totalFee = scanner.nextDouble();
                System.out.println("You have selected Day Scholler!!!");
                DayScholar dayScholar = new DayScholar(id,name,examFee,transportFee);
                dayScholar.payFee(totalFee);
                System.out.println(dayScholar);

            }

        }
    }
}
