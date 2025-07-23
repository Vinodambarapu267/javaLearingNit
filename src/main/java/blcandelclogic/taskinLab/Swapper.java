package blcandelclogic.taskinLab;
import java.util.Scanner;

public class Swapper{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        NumberSwapper.swapAndDisplay(a,b);
    }
}

class NumberSwapper{
    public static void swapAndDisplay(int a,int b){
        int temp = a;
        a=b;
        b =temp;
        System.out.println("After Swapping:");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
    }
}