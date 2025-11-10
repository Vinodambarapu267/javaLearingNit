package arrays;

import java.util.Scanner;

public class MiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Array size.");
        }
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       if (n%2==1){
           System.out.println(arr[n/2]);
        }else {
           System.out.println(arr[n/2]-1+" "+arr[n/2]);
       }
    }
}
