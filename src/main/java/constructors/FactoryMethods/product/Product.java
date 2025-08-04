package constructors.FactoryMethods.product;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private  double price;
    private int quantity;

    private Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public  static Product createProductObject(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a product ID: ");
        int id = sc.nextInt();
        System.out.println("enter a product name: ");
        String name = sc.next();
        System.out.println("enter a product price: ");
        double price = sc.nextDouble();
        System.out.println("enter a product quantity: ");
        int quantity= sc.nextInt();
        return new Product(id,name,price,quantity);
    }
    public double calculateAmount(){
        double totalAmount = price*quantity;
//
        if(totalAmount>1000){
            totalAmount = totalAmount-(totalAmount*0.1);
        }

        else if(totalAmount>500){
            totalAmount=totalAmount-(totalAmount*0.05);
        }
        if (totalAmount<=500){
            return totalAmount;
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
