package exception;
import java.util.Scanner;
class FinancialTransaction{
    public static void main(String []args){
        FinancialTransaction fc = new FinancialTransaction();


        try{
            Scanner sc = new Scanner(System.in);
            double amt = sc.nextDouble();
            long num = sc.nextLong();
            if(amt<=0){
                throw new IllegalArgumentException();
            }

            fc.processTransaction(amt,num);
        }
        catch(NumberFormatException e){
            System.out.println("Error processing transaction: Transaction amount must be positive.");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error processing transaction: Transaction amount must be positive.");
        }
        catch(Exception e){
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }
    }
    public void processTransaction(double amount,long accNum){
        System.out.println("Processing transaction...");
        System.out.println("Transaction successful: Amount Rs."+amount+" transferred to account "+accNum);


    }
}