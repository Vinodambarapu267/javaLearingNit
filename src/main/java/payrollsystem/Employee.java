package payrollsystem;

public class Employee {
    private int employeeId;
    private  String empName;
    private double basicSalary;
    private double HRAper;
    private double DAper;

    public Employee(int employeeId, String empName, double basicSalary, double HRAper, double DAper) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.HRAper = HRAper;
        this.DAper = DAper;
    }
 public double calculateGrossSalary(){
     return basicSalary+HRAper+DAper;
 }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", empName='" + empName + '\'' +
                ", basicSalary=" + basicSalary +
                ", HRAper=" + HRAper +
                ", DAper=" + DAper +
                '}';
    }
}
