package oopsconcepts.blc;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    double productPrice;
    public  void setProductData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a product Id:");
        productId=Integer.parseInt(sc.nextLine());
        System.out.println("enter a product Name: ");
        productName=sc.nextLine();
        System.out.println("enter a product Price:");
        productPrice =sc.nextDouble();
    }
    public  void getProductData(){
        System.out.println("product id: "+productId);
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+productPrice);
    }

}
