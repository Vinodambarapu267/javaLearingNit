package arrays.comparator_comparable_demo;

import java.util.Arrays;
import java.util.Scanner;

record Product(Integer id,String name,Double price) implements Comparable<Product>{


    @Override
    public int compareTo(Product p1) {
        return this.price.compareTo(p1.price);
    }
}
public class ProductComparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc){
            System.out.println("Enter the size :");
            int size = Integer.parseInt(sc.nextLine());
            Product products[] = new Product[size];
            for (int i=0;i<size;i++){
                System.out.println("Enter the "+(i+1)+" product Id: ");
                int id =Integer.parseInt(sc.nextLine());
                System.out.println(i+"Enter the "+(i+1)+" product Name");
                String name = sc.nextLine();
                System.out.println(i+"Enter the "+(i+1)+" product Price");
                double price =Double.parseDouble(sc.nextLine());
               products[i]= new Product(id,name,price);
            }
            System.out.println("Original Data: "+ Arrays.asList(products));
            Arrays.sort(products);
            System.out.println("Sort Data as price: "+Arrays.asList(products));

        }
        catch (NegativeArraySizeException e){
            String message = e.getMessage();
            System.err.println(message);
        }
    }
}
