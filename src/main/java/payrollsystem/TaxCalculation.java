package payrollsystem;

public class TaxCalculation {
    public static void main(String[] args) {
        Employee employee = new Employee(121,"vinu",40000,2000,5000);
        System.out.println("Employee tax :"+ employee.calculateGrossSalary());
        Manager manager = new Manager(122,"raj",60000,4000,6000,10000);
        System.out.println("Manager tax:"+manager.calculateGrossSalary());
        Trainer trainer = new Trainer(233,"ram",30000,3000,1000,20,2000);
        System.out.println("Trainer Tax: "+trainer.calculateGrossSalary());
        Sourcing sourcing = new Sourcing(99,"dev",50000,5000,4000,10,9,2000);
        System.out.println("Sourcing Tax: "+sourcing.calculateGrossSalary());
//        TaxUtil taxUtil= new TaxUtil();
        System.out.println("________________________________");
        System.out.println("employee :"+TaxUtil.calculateTax(employee));
        System.out.println("Employee Gross salary:"+employee.calculateGrossSalary());
        System.out.println("Manager :"+TaxUtil.calculateTax(manager));
        System.out.println("manager Gross salary:"+trainer.calculateGrossSalary());
        System.out.println("trainer :"+TaxUtil.calculateTax(trainer));
        System.out.println("trainer Gross salary:"+trainer.calculateGrossSalary());
        System.out.println("sourcing :"+TaxUtil.calculateTax(sourcing));
        System.out.println("sourcing Gross salary:"+sourcing.calculateGrossSalary());
    }
}
