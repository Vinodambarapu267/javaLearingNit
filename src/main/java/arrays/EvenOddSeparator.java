package arrays;

import java.util.Scanner;

public class EvenOddSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Invalid array size. Size must be greater than 0.");
        }
        int arr[] =new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i= 0; i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        for (int j=0; j<arr.length;j++){
            if (arr[j]%2!=0){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
