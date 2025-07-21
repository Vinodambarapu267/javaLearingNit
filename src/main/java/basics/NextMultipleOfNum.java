package basics;

import java.util.Scanner;

public class NextMultipleOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<0){
            System.out.println(-1);
        }else if(num>0 &&num<100){
            System.out.println(100);
        }else if(num>100){
            int out = num/100;
            int multiple = (out+1)*100;
            System.out.println(multiple);
        }
    }
}
