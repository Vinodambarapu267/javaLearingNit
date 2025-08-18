package inheritance.student_fee_management_System;

public class Hosteller extends Student{
    protected  double hostelFee;

    public Hosteller(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        this.hostelFee = hostelFee;
    }
    public double payFee(double amount){

        double totalAmount = examFee + hostelFee;
        if (amount > totalAmount) {
            System.out.println("Refundable amount: " + (amount - totalAmount));
        } else if (amount < totalAmount) {
            System.out.println("payable Amount: " + (totalAmount - amount));
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Hosteller{" +
                "studentId=" + studentId +
                ", name='" + name  +
                ", examFee=" + examFee +
                ", hostelFee=" + hostelFee +
                '}';
    }
}
