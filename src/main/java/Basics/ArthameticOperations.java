package Basics;

import java.util.Scanner;

public class ArthameticOperations {
    public static void main(String[] args) {
        System.out.print("Enter a and b values: ");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int add =a+b;
        int  sub= a-b;
        int mul = a*b;
        int div = a/b;
        int mod =a%b;
        System.out.println("Addition "+add);
        System.out.println("Substraction "+sub);
        System.out.println("Multiplication"+mul);
        System.out.println("Division : "+div);
        System.out.println("Modulus "+mod);
    }
}
