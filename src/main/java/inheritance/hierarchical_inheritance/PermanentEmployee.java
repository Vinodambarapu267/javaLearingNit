package inheritance.hierarchical_inheritance;

public class PermanentEmployee extends Employee {
    protected double providentFund;
     public PermanentEmployee(int employeeId,String employeeName,double employeeSalary,double providentFund){
         super(employeeId,employeeName,employeeSalary);

         this.providentFund=employeeSalary*0.12;
     }
     public void netSalary(){
         double netSalary = employeeSalary+providentFund;
         System.out.println("Net salary :"+netSalary);
     }

    @Override
    public String toString() {
        return "PermanentEmployee: " +
                "\t\temployeeId=" + employeeId +
                "\n\t\temployeeName=" + employeeName  +
                "\n\t\temployeeSalary=" + employeeSalary +
                "\n\t\tprovidentFund=" + providentFund;
    }
}
