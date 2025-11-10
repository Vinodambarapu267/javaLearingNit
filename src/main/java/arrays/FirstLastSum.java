package arrays;

import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        int sum = arr[0]+arr[arr.length-1];
        System.out.println(sum);
    }
}
