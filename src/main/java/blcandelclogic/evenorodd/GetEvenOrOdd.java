package blcandelclogic.evenorodd;

import java.util.Scanner;

public class GetEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        String result = EvenOrOdd.GetNum(number);
        System.out.println("Output: "+result);
    }
}
