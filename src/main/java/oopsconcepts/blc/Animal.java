package oopsconcepts.blc;

import java.util.Scanner;

public class Animal {
    String name;
    double height;
    int age;
     public  void setWildAnimal(){
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter a animal name:");
         name = sc.nextLine();
         System.out.println("Enter a Animal height");
         height= Double.parseDouble(sc.nextLine());
         System.out.println("Enter a animal Age");
         age =Integer.parseInt(sc.nextLine());

     }
     public  void getWildAnimal(){
         System.out.println("Animal Name: "+name);
         System.out.println("Animal Height: "+height);
         System.out.println("Animal Age: "+age);
     }
    public  void setDomesticAnimal(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a animal name:");
        name = sc.nextLine();
        System.out.println("Enter a Animal height");
        height= Double.parseDouble(sc.nextLine());
        System.out.println("Enter a animal Age");
        age =Integer.parseInt(sc.nextLine());
}
   public  void getDomesticAnimal(){
       System.out.println("Animal Name: "+name);
       System.out.println("Animal Height: "+height);
       System.out.println("Animal Age: "+age);
   }


}
