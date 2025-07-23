package blcandelclogic.taskinLab;
import java.util.Scanner;

public class NumberReverser{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n>9&&n<100){
            int result =  TwoDigitReverser.getReverse(n);
            System.out.println("Reversed Number: "+result);
        }else{
            System.out.println("Error: Invalid Input");
        }
    }
}

class TwoDigitReverser{
    public static int getReverse(int num){
        int rev = ((num%10)*10)+num/10;
        return rev;
    }
}
