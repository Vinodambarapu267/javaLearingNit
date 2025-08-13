package inheritance.multiinheritance;

import java.util.Scanner;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1->{

               mammal.eat();
               mammal.walk();
               mammal.bark();

            }
            case  2->{

               mammal.eat();
                mammal.walk();
            }
            case 3->
                mammal.eat();
            default -> System.out.println("Error Invalid Input");

        }
    }
}
