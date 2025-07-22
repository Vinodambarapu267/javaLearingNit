package switchcases;

import java.util.Scanner;

public class VowelOrCosonents {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character");
        char character = sc.nextLine().toUpperCase().charAt(0);
        String output = switch (character){
            case 'A','E','I','O','U'->"Vowels";

            default -> "Consonents";
        };
        System.out.println(output);
    }
}
