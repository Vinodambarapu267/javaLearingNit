package inheritance.hierarchical_inheritance;

public class ContractEmployee extends  Employee{
    protected int contractDuration ;

    public ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
        super(employeeId, employeeName, employeeSalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public String toString() {
        return "ContractEmployee:" +
                "\n\t\temployeeId=" + employeeId +
                "\n\t\temployeeName=" + employeeName  +
                "\n\t\temployeeSalary=" + employeeSalary +
                "\n\t\tcontractDuration=" + contractDuration +" years";
    }
}
