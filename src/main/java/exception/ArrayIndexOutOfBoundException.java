package exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException
{
    public static void main(String[] args) {
        try{
            int a[]=new int[2];
            a[0]=10;
            a[1]=20;
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            System.out.println(a[index]);

        }catch (Exception e ){
            System.out.println(e);
            e.toString();
            e.getMessage();
            e.printStackTrace();
        }
    }
}
