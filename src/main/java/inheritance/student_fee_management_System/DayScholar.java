package inheritance.student_fee_management_System;

public class DayScholar extends Student{
    protected double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        this.transportFee = transportFee;
    }

    public double payFee(double amount) {

        double totalAmount = examFee + transportFee;
        if (amount > totalAmount) {
            System.out.println("Refundable amount: " + (amount - totalAmount));
        } else if (amount < totalAmount) {
            System.out.println("payable Amount: " + (totalAmount - amount));
        }
        return totalAmount;
    }
    @Override
    public String toString() {
        return "DayScholar{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", examFee=" + examFee +
                ", transportFee=" + transportFee +
                '}';
    }
}
