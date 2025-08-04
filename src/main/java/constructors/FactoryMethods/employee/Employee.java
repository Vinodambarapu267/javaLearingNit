package constructors.FactoryMethods.employee;

import java.util.Scanner;

public class Employee {
private  String name;
private int empId;
private String department;
private double salary;

    private  Employee(String name, int empId, String department, double salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }
    public  static Employee createEmpoyeeObject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Employee Name: ");
        String name = sc.next();
        System.out.println("Enter a Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Department (Sales, Engineering, HR, Other): ");
        String dept  =sc.next().toUpperCase();
        System.out.println("Enter a Employee Salary: ");
        double salary = sc.nextDouble();
        return new Employee(name,id,dept,salary);
    }
    public double calculateAnnualSalary(){
        double output = switch (department){
            case "SALES"->this.salary=salary+salary*0.1;
            case "ENGINEERING"->this.salary=salary+salary*0.15;
            case "HR"->this.salary=salary+salary*0.08;
            default -> this.salary=salary+salary*0.05;//108000//720000
        };
        return output;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
