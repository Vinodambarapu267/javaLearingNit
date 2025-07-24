package oopsconcepts;

import java.util.Scanner;

public class DogElc{
    public static void main(String []args){
        Dog dog1 = new Dog();
        dog1.getDogInformation();
        dog1.bark();
    }
}
class Dog{
    Scanner sc = new Scanner(System.in);
    String name =sc.nextLine();
    double height=sc.nextDouble();
    int age=sc.nextInt();
    public void getDogInformation(){
        System.out.println("Dog Name:"+name);
        System.out.println("Dog height: "+height);
        System.out.println("Dog age: "+age);
    }
    public void bark(){
        System.out.println(name+" is barking");
    }
}
