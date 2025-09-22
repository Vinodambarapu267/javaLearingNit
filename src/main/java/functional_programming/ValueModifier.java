package functional_programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {


    public static void modifyValue(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Consumer<Integer> doubleValue =num-> {
            System.out.println("Original value: "+num);
            System.out.println("\nAfter doubling the value:" + (num + num));
            System.out.println("\nAfter incrementing the value by 3" + (num * 3));
            System.out.println("\nAfter squaring the value: "+(num*num));
        };
doubleValue.accept(num1);
    }
    public static void main(String[] args) {

ValueModifier.modifyValue();
    }
}
