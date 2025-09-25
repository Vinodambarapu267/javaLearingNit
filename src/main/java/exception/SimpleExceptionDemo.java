package exception;

import java.util.Scanner;

public class SimpleExceptionDemo {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num value");
            int a = sc.nextInt();
            System.out.println("Enter b num value");
            int b = sc.nextInt();
            System.out.println("you entered a = "+a+" and b = "+b);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("InputMismatchException occurred. Please enter only integer numbers.");
             e.getMessage();
             e.toString();
            e.printStackTrace();
            System.out.println();
        }

        System.out.println();
    }
}
