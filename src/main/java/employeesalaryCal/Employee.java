package employeesalaryCal;

public class Employee {
    int employeeNumber;
    String employeeName;
    double employeeSalary;
    public Employee(int id,String name, double salary){
        this.employeeNumber =id;
        this.employeeName = name;
        this.employeeSalary=salary;
    }

    public void calculateSalaryIncrement()
    {
        if(employeeSalary<=50000){
            System.out.println("before increment :"+employeeSalary);
            employeeSalary=employeeSalary+(employeeSalary*0.1);
            System.out.println("employee salary"+employeeSalary);
        }else if(employeeSalary>=50000&&employeeSalary<=80000)
        {
            System.out.println("before increment :"+employeeSalary);
            employeeSalary=employeeSalary+employeeSalary*0.07;
            System.out.println("employee salary"+employeeSalary);

        }else {
            System.out.println("before increment :"+employeeSalary);
            employeeSalary=employeeSalary+employeeSalary*0.05;
            System.out.println("employee salary"+employeeSalary);
        }
    }
    public  void getEmployeeDetails(){
        System.out.println(employeeNumber);
        System.out.println(employeeName);
        calculateSalaryIncrement();
    }
//

}
