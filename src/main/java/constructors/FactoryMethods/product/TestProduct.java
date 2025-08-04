package constructors.FactoryMethods.product;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int noObj= sc.nextInt();
        for(int i=1;i<noObj;i++){
            Product product = Product.createProductObject();
            System.out.println(product);
            System.out.println("Total Amount (After discount):"+product.calculateAmount());
        }//1080000//
    }
}
