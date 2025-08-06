package payrollsystem;

public class Manager {
    private int managerId;
    private String managerName;
    private double basicSalary;
    private double HRAper;
    private double DAper;
    private double projectAllowance;

    public Manager(int managerId, String managerName, double basicSalary, double HRAper, double DAper, double projectAllowance) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.basicSalary = basicSalary;
        this.HRAper = HRAper;
        this.DAper = DAper;
        this.projectAllowance = projectAllowance;
    }
    public double calculateGrossSalary(){
        return basicSalary+HRAper+DAper+projectAllowance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", basicSalary=" + basicSalary +
                ", HRAper=" + HRAper +
                ", DAper=" + DAper +
                ", projectAllowance=" + projectAllowance +
                '}';
    }
}

