package Basics;

public class palindrome {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
         int m = num;
        int r=0;
        while(num>=0){
            r = num%10;
           num =  num/10;
        }
        System.out.println();
        if(r==m){
         System.out.println("Palindorme :"+r);
        }else{
            System.out.println("Not a Palindorme"+r);
        }

    }
}
