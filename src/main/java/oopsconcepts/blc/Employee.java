package oopsconcepts.blc;

public class Employee {
    String employeeId;
    String employeeName;
    double employeeSalary;
    public void setEmployeeData(String id,String name,double salary){
        employeeId =id;
        employeeName=name;
        employeeSalary=salary;
    }
    public  void getEmployeeData(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+employeeSalary);
    }



}
