package payrollsystem;

public class Trainer {
    private int trainerInt;
    private String trainerName;
    private  double basicSalary;
    private  double HRAper;
    private double DAper;
    private int batchCount;
    private double perkPerBatch;

    public Trainer(int trainerInt, String trainerName, double basicSalary, double HRAper, double DAper, int batchCount, double perkPerBatch) {
        this.trainerInt = trainerInt;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.HRAper = HRAper;
        this.DAper = DAper;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }
    public  double calculateGrossSalary(){
        return basicSalary+HRAper+DAper+(batchCount*perkPerBatch);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerInt=" + trainerInt +
                ", trainerName='" + trainerName + '\'' +
                ", basicSalary=" + basicSalary +
                ", HRAper=" + HRAper +
                ", DAper=" + DAper +
                ", batchCount=" + batchCount +
                ", perkPerBatch=" + perkPerBatch +
                '}';
    }
}
