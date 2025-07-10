package Basics;

public class TwoDigitSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
            int l = n%10;
            int f = n/10;
            int sum = l+f;
            System.out.println("Sum of digit : "+sum);
    }
}
