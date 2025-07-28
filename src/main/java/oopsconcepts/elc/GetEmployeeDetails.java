package oopsconcepts.elc;

import oopsconcepts.blc.Employee;

public class GetEmployeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeData("TCS24AV","Vinod",90000.678);
        employee.getEmployeeData();
    }
}
