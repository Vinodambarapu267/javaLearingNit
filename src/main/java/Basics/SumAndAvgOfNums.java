package Basics;

public class SumAndAvgOfNums {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int sum = num1+num2+num3;
        float avg = (float) sum/3;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
    }
}
