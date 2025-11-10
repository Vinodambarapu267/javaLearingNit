package arrays;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        if (n<=0){
            System.out.println("insert edgnfg");
            System.exit(0);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Output : ");
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
