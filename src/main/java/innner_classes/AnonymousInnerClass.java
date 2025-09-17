package innner_classes;

abstract class Loan{
    public abstract void applyLoan();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
       Loan carLoan = new Loan() {
           @Override
           public void applyLoan() {
               System.out.println("Apply for car Loan ");
           }
       };
       Loan bikeLoan = new Loan() {
           @Override
           public void applyLoan() {
               System.out.println("Apply for Bike loan");
           }
       };
       carLoan.applyLoan();
       bikeLoan.applyLoan();
    }
}
