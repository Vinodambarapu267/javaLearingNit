package constructors.FactoryMethods.employee;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.of Employee Details");
        int noObj = sc.nextInt();
        for (int i=1;i<=noObj;i++){
            Employee employee =Employee.createEmpoyeeObject();

            System.out.println(employee);
//
            System.out.println("Annual Salary (with Bonus): "+12*employee.calculateAnnualSalary());
        }
    }

}
