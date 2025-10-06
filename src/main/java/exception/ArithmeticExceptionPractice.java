package exception;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ArithmeticExceptionPractice {
    public static int performDivision(int dividend,int divisor){

        int num1 = dividend;
        int num2 = divisor;
        int output = num1/num2;
        return  output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
       try {

           System.out.println("Result: "+performDivision(num1,num2));
       }catch (ArithmeticException e ){
           System.out.println("ArithmeticException caught: Divsion by zero: divided ="+num1+" divisor="+num2);
//           e.printStackTrace();
           e.getMessage();


       }
       catch (NumberFormatException e){
           e.getMessage();
           System.out.println("Enter integer values only");
       }
        System.out.println("PROGRAM EXECUTED");
    }
}
