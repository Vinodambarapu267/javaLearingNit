package inheritance.hierarchical_inheritance;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter permanent employee Id:");
        int id = sc.nextInt();
        System.out.print("Enter permanent employee Name :");
        String name = sc.next();
        System.out.print("Enter permanent employee Salary :");
        double salary = sc.nextDouble();

        System.out.println("Enter a contact duration in year");
        int year = sc.nextInt();
        PermanentEmployee p1 = new PermanentEmployee(id,name,salary,salary*0.12);
        System.out.println(p1);
        p1.netSalary();
        System.out.println("=============================================");
        ContractEmployee c1 = new ContractEmployee(id,name,salary,year);
        System.out.println(c1);
    }
}
