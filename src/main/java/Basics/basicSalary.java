package Basics;

public class basicSalary {
    public static void main(String[] args) {
     int basicSalary = Integer.parseInt(args[0]);
     int hra = (basicSalary*15)/100;
     int conveyance = +(basicSalary*15)/100;
     int entertrainment = (basicSalary*10)/100;
     int totalsalary = basicSalary + hra + conveyance + entertrainment;
     System.out.println("Basic Salary :"+basicSalary);
     System.out.println("Total salary : "+totalsalary);
    }
}
