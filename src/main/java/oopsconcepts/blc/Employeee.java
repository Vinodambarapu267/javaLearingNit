package oopsconcepts.blc;

public class Employeee {
    String firstName;
    String lastName;
    int employeeId;
    double salary;
    int noOfProject;
    public void setEmployeeData(String fname,String lname,int id,double sal,int Project){
        firstName=fname;
        lastName=lname;
        employeeId=id;
        noOfProject=Project;
        salary=sal;

    }


    public void updateSalary(){
        if(noOfProject<10){
            salary=salary+5000;
        }else  if(noOfProject>10&&noOfProject<20){
            salary=salary+10000;
        }
        else{
            salary=salary+15000;
        }
    }
    @Override
    public String toString() {
        return
                "Name: " + firstName+" "+lastName +
                        "\nEmployee ID:" + employeeId +
                        "\nNo. of Projects:" + noOfProject +
                        "\nUpdated Salary:"+salary;

    }

}
