package basics;

import java.util.Scanner;

public class NumberOfdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numbers of days :");
        int numberOfDays = scanner.nextInt();
        int years =  numberOfDays/365;
        int months = (numberOfDays%365/30);
        int weeks = numberOfDays%365%30/7;
        int days = numberOfDays%365%30%7;
        System.out.println("Years"+years);
        System.out.println("Months : "+months);
        System.out.println("Weeks "+weeks);
        System.out.println("Days : "+days);


    }
}
