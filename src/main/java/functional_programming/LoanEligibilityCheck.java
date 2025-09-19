package functional_programming;

/*
*LoanEligibilityCheck
Develop a program using a functional interface to check whether a Customer is eligible for a loan.
Record Name: Customer
name : String
salary : Double
creditScore : Integer
age : Integer
Method Name: checkLoanEligibility()
Return Type: boolean
Access Modifier: public
Parameter: None
Use Predicate<Customer> to check eligibility based on:
Salary > 25,000
Credit Score > 700
Age > 21
Eligibility must satisfy all conditions (AND).
If eligible::
<name> is Eligible for Loan
Otherwise:
   <name> is NOT Eligible for Loan
Input Format
Customer Name (String)
Salary (Double)
Credit Score (Integer)
Age (Integer)
Output Format
Eligibility result in the given format.
 **/
import java.util.Scanner;
import java.util.function.Predicate;

record Customer(String name, Double salary, Integer creditScore, Integer age) {
    public boolean checkLoanEligibility() {
        Predicate<Customer> check= c-> c.salary() >25000 && c.age()>21 &&
                c.creditScore>700;
        return check.test(this);
    }

}

public class LoanEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        Double salary = sc.nextDouble();
        int creditScore = sc.nextInt();
        int age = sc.nextInt();
       Customer customer = new Customer(name,salary,creditScore,age);
        if(customer.checkLoanEligibility()){
            System.out.println(name+" is Eligible for Loan ");
        }else {
            System.out.println(name+" is NOT Eligible for Loan");
        }
    }
}
