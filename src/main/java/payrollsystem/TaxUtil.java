package payrollsystem;

public class TaxUtil {
  public static double calculateTax(Employee e){
      double gross =e.calculateGrossSalary();
      return (gross>50000)?gross*0.2:gross*0.05;
  }
    public static double calculateTax(Manager m){
        double gross =m.calculateGrossSalary();
        return (gross>50000)?gross*0.2:gross*0.05;
    }
    public static double calculateTax(Trainer t){
        double gross =t.calculateGrossSalary();
        return (gross>50000)?gross*0.2:gross*0.05;
    }
    public static double calculateTax(Sourcing s){
        double gross =s.calculateGrossSalary();
        return (gross>50000)?gross*0.2:gross*0.05;
    }
}
