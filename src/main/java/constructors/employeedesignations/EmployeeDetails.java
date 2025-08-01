package constructors.employeedesignations;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Id");
        int num = sc.nextInt();
        System.out.print("Enter a Name: ");
        String name = sc.next();
        System.out.print("Enter a salary: ");
        double salary = sc.nextDouble();
        Employee employee = new Employee(num,name,salary);
        System.out.println("Employee Number :"+employee.getEmployeeNumber());
        System.out.println("Employee Name: "+employee.getEmployeeName());
        System.out.println("Employee Salary: "+employee.getEmployeeSalary());
        if(employee.getEmployeeSalary()>90000){
            System.out.println("Employee is a developer");
        }else if(employee.getEmployeeSalary()>60000){
            System.out.println("Employee is a Designer");
        }else {
            System.out.println("Employee is a Tester");
        }
    }
}
