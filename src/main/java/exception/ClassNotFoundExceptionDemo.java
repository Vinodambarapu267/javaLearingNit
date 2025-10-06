package exception;


import java.util.Scanner;

public class ClassNotFoundExceptionDemo {

    public ClassNotFoundExceptionDemo(String className) {

        try{
            Class.forName(className);
            System.out.println("class Loaded successFully"+className);
        }catch (ClassNotFoundException e){
            System.out.println("Error: Class '"+className+" not found.");
            e.printStackTrace();
        }


    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        new ClassNotFoundExceptionDemo(string);
    }
}
