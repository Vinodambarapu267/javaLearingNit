package basics;


import java.util.Scanner;

public class CalculateInterestAndAmonut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Principal Amount : ");
        int principal_Amount= sc.nextInt();
        System.out.print("Enter a Rate : ");
        int rate = sc.nextInt();
        System.out.print("enter a time : ");
        int time = sc.nextInt();
        float  interest = (float) (principal_Amount*time*rate)/100;
        float amount = principal_Amount+interest;
        System.out.println("Amount :"+amount);
        System.out.println("Interest : "+interest);
    }
}
