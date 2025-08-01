package constructors.employeedetails;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("enter firstName: ");
        String fName = sc.next();
        System.out.print("Enter a lastName: ");
        String lName = sc.next();
        System.out.print("Enter a employee Id: ");
        int id = sc.nextInt();
        System.out.print("Enter a employee salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter a no of projects: ");
        int projects = sc.nextInt();
        Employee employee = new Employee(fName,lName,id,salary,projects);
        System.out.println(employee);
        employee.calculateSalary();
        //System.out.println(employee);

    }
}
