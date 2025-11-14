package collection_packages.arraylist.sorting_of_data.product_using_comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingOfProduct {
    static void main() {
        ArrayList<Product> products = new ArrayList<>();
        Product product = null;
        Scanner sc = new Scanner(System.in);
        int objectLen =Integer.parseInt(sc.nextLine());
        for (int i = 0; i < objectLen; i++) {
            System.out.println("Enter the Number: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the product Name: ");
            String name = sc.nextLine();
            System.out.println("Enter the price");
            double price = Double.parseDouble(sc.nextLine());
            product = new Product(num,name,price);
          products.add(product);
        }

        Collections.sort(products);
        for (Product p: products){
            System.out.println(p);
        }
    }
}
