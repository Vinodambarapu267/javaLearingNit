package switchcases;

import java.util.Scanner;

public class SubjectSelectionInterestPer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a subject ");
        System.out.println("-------------=-------");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. Oracle");
        System.out.println("4. HTML");
        System.out.println("---------------------");
        System.out.println("Enter a subject in the given list");
        String subject = scanner.nextLine();
        float interest = scanner.nextInt();
        scanner.nextLine();
        String output = switch (subject){
          case "1", "orcale" ->"your are selected : java\n"+"your interest percentage:"+interest;
            case "2"->"your are selected : c\n"+"your interest percentage:"+interest;
            case "3"->"your are selected html : \n"+"your interest percentage:"+interest;
            case "4"-> "your are selected oracle : \n"+"your interest percentage:"+interest;
            default -> "please select subject in given list";
        };
        System.out.println(output);
    }
}
