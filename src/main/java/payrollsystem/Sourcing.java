package payrollsystem;

public class Sourcing {
    private  int sourceId;
    private String sourceName;
    private double basicSalary;
    private double HRaper;
    private double DAper;
    private int enrollmentTarget;
    private int enrollmentReached;
    private double perkEnrollment;

    public Sourcing(int sourceId, String sourceName, double basicSalary, double HRaper, double DAper, int enrollmentTarget, int enrollmentReached, double perkEnrollment) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.basicSalary = basicSalary;
        this.HRaper = HRaper;
        this.DAper = DAper;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkEnrollment = perkEnrollment;
    }
    public  double calculateGrossSalary(){
        return  basicSalary+HRaper+DAper+(((enrollmentReached/enrollmentTarget)*100)*perkEnrollment);
    }

    @Override
    public String toString() {
        return "Sourcing{" +
                "sourceId=" + sourceId +
                ", sourceName='" + sourceName + '\'' +
                ", basicSalary=" + basicSalary +
                ", HRaper=" + HRaper +
                ", DAper=" + DAper +
                ", enrollmentTarget=" + enrollmentTarget +
                ", enrollmentReached=" + enrollmentReached +
                ", perkEnrollment=" + perkEnrollment +
                '}';
    }
}
