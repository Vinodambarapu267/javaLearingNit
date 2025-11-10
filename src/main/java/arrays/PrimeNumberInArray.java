package arrays;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; i < arr.length - 1; i++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
