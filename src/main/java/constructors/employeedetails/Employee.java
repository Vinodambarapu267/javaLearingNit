package constructors.employeedetails;

public class Employee {
    String firstName;
    String lastName;
    int employeeId;
    double salary;
    int noOfProjects;

    public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProjects) {
       if(noOfProjects<0){
           System.err.println(" Invalid Number of Projects (Negative Value)");
       }

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.noOfProjects = noOfProjects;
    }
public  void calculateSalary(){
        if (noOfProjects>20){

            salary+=15000;
            System.out.println("After update: "+salary);
        }else if (noOfProjects>10){
            salary+=10000;
            System.out.println("after update: "+salary);
        }
        else {
            salary+=5000;
            System.out.println("after update: "+salary);
        }
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    @Override
    public String toString() {
        return "Employee Name: " + firstName + " "+lastName +
                "\n EmployeeId: " + employeeId +
                "\n Salary: " + salary +
                "\n NoOfProjects: " + noOfProjects ;
    }
}
