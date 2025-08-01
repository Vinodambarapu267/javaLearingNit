package constructors.employeedesignations;

public class Employee {
    private  int  employeeNumber;
    private  String employeeName;
    private double employeeSalary;

    public Employee(int employeeNumber, String employeeName, double employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }


}
