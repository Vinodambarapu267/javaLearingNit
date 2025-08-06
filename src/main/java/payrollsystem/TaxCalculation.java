package payrollsystem;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Employee employee = new Employee(121,"vinu",40000,2000,5000);
//        System.out.println("Employee tax :"+ employee.calculateGrossSalary());
        Manager manager = new Manager(122,"raj",60000,4000,6000,10000);
//        System.out.println("Manager tax:"+manager.calculateGrossSalary());
        Trainer trainer = new Trainer(233,"ram",30000,3000,1000,20,2000);
//        System.out.println("Trainer Tax: "+trainer.calculateGrossSalary());
        Sourcing sourcing = new Sourcing(99,"dev",50000,5000,4000,10,9,2000);
//        System.out.println("Sourcing Tax: "+sourcing.calculateGrossSalary());
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("1. Employee");
        System.out.println("2. Manager");
        System.out.println("3. Trainer");
        System.out.println("4. Sourcing");
        System.out.println("select from above options: ");
        int value =sc.nextInt();
        switch (value){
            case 1->{System.out.println("Employee Details:"+employee);
                System.out.println("employee :"+TaxUtil.calculateTax(employee));//tax
                System.out.println("Employee Gross salary:"+employee.calculateGrossSalary());}
            case 2 ->{
                System.out.println("Manager Details:"+manager);
                System.out.println("Manager :"+TaxUtil.calculateTax(manager));
                System.out.println("manager Gross salary:"+trainer.calculateGrossSalary());
            }
            case 3->{
                System.out.println("Trainer Details:"+trainer);
                System.out.println("trainer :"+TaxUtil.calculateTax(trainer));
                System.out.println("trainer Gross salary:"+trainer.calculateGrossSalary());
            }
            case 4->{
                System.out.println("Sourcing Details:"+sourcing);
                System.out.println("sourcing :"+TaxUtil.calculateTax(sourcing));
                System.out.println("sourcing Gross salary:"+sourcing.calculateGrossSalary());
            }
            default -> System.out.println("please select from above only");
        }

    }
}
