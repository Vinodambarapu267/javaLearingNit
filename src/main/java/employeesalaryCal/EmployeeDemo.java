package employeesalaryCal;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a employee1 number");
        int id = sc.nextInt();
        System.out.println("enter a employee1 Name:");
        String name= sc.next();
        System.out.println("enter a employee1 salary:");
        double salary = sc.nextDouble();



        System.out.println("Enter a employee2 number");
        int id1 = sc.nextInt();
        System.out.println("enter a employee2 Name:");
        String name1= sc.next();
        System.out.println("enter a employee2 salary:");
        double salary1 = sc.nextDouble();

        System.out.println("Enter a employee3 number");
        int id2 = sc.nextInt();
        System.out.println("enter a employee3 Name:");
        String name2= sc.next();
        System.out.println("enter a employee3 salary:");
        double salary2 = sc.nextDouble();



        Employee employee =new Employee(id,name,salary);
        employee.getEmployeeDetails();
        System.out.println("--------------------");

        Employee employee1 = new Employee(id1,name1,salary1);
        employee1.getEmployeeDetails();
        System.out.println("--------------------");

        Employee employee2 = new Employee(+id2,name2,salary2);
        employee2.getEmployeeDetails();
    }
}
