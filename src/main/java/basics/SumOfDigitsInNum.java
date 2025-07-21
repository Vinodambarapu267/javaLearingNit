package basics;

import java.util.Scanner;

public class SumOfDigitsInNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>10 &&num<99){
            int rem = num%10;
            int firstDigit = num/10;
            int sum = firstDigit+rem;
            System.out.println("Sum of Two digits : "+sum);
        }else if(num>=0 &&num<=9){
            System.out.println(-1);
        }else if(num >99){
            System.out.println(-2);
        }else {
            System.out.println(-3);
        }
    }
}

