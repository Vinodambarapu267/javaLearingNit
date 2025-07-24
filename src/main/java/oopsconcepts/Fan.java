package oopsconcepts;

import java.util.Properties;
import java.util.Scanner;

public class Fan {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
    FanDetails fanDetails = new FanDetails();
        System.out.println("enter the fan name:");
    fanDetails.name=sc.nextLine();
        System.out.println("enter the fan type:");
    fanDetails.type=sc.nextLine();
        System.out.println("enter a fan wings");
    fanDetails.wings=sc.nextInt();
    fanDetails.fanProperties();
    fanDetails.fanON();
    fanDetails.fanOFF();

}
}