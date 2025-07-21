package switchcases;

import java.util.Scanner;

public class SimpleCal {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String cal = sc.nextLine().trim().toUpperCase();

        switch(cal){
            case "ADD"->System.out.println("Result:"+(a+b));
            case "SUB"->System.out.println("Result:"+(a-b));
            case "MUL"->System.out.println("Result:"+(a*b));
            case "DIV" -> {
                if(b==0||a==0){
                    System.out.println("cannot div by zero");
                }else {
                    System.out.println("Result:"+(a/b));}
            }
            default ->System.out.println("Invalid choice");
        }

    }
}