package exception;
import java.util.Scanner;

class ArrayStoreExample{
    public static void storeObjects(){
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1->{
                Object [] strings = new String[3];
                strings[0] = "Hello";   // Storing a String
                strings[1] = "World";   // Storing another String
                strings[2] = "Java";
                System.out.println("Objects stored successfully.");
            }
            case 2->{
                try{
                    Object [] strings = new String[3];
                    strings[0] = "Hello";   // Storing a String
                    strings[1] = "World";   // Storing another String
                    strings[2] = 123;

                }
                catch(ArrayStoreException e){
                    System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");
                }
            }
        }
    }
    public static void main(String[]args){
        ArrayStoreExample.storeObjects();
    }
}