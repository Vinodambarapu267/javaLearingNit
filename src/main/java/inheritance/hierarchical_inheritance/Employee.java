package inheritance.hierarchical_inheritance;

public class Employee {
    protected int employeeId;
    protected String employeeName;
    protected  double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        if(employeeId<0){
            System.out.println("Invalid Employee Id");
            System.exit(0);
        }if(employeeName.isEmpty()){
            System.out.println("Employee Name can't be null");
            System.exit(0);
        }if(employeeSalary<0){
            System.out.println("Salary can't be 0 or negative");
            System.exit(0);
        }
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
