package exception;

import java.util.Scanner;

public class ExceptionHandliingDemo {
    public static void handleExceptions(String str) {
        try {
            int length = str.length();
            System.out.println("Length of the input string: " + length);

            int number = Integer.parseInt(str);
            System.out.println("Converted to integer: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Input is not a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Input is null.");
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        String str=sc.nextLine();
        if ("null".equals(str)|str.isEmpty()) {
            str = null;
        }
        handleExceptions(str);

        sc.close();


    }

}