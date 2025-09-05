package polymorphism.shoping_mall_application;

import java.util.Scanner;

public class ShoppingMall {
    public static  void  generateBill(Customer customer,double... price){
        customer.calculateBill(price);
    }
    public static void main(String[] args) {
        Customer cust=null;
        System.out.println("Please select the Customer Type to get additional Discount :\n" +
                "\t\t 1) General Customer \n" +
                "\t\t 2) Prime Customer \n" +
                "\t\t 3) VIP Customer ");
        System.out.println("Please enter Customer type :");
        Scanner sc= new Scanner(System.in);
        int choice =sc.nextInt();
        switch (choice){
            case 1->{
                System.out.println("Enter your Name :");
                String name= sc.next();
                System.out.println("Enter number of Items :");
                int num= sc.nextInt();
                String []items=new String[num];
                double []price=new double[num];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i=0;i<num;i++){
                    System.out.println((i+1)+") Item Name:");
                    items[i]=sc.next();
                    System.out.println("1Item price:");
                    price[i]=sc.nextDouble();
                }
                cust=new GenralCustomer(name);
                generateBill(cust,price);
            }
            case 2->{
                System.out.println("Enter your Name :");
                String name1= sc.next();
                System.out.println("Enter number of Items :");
                int num1= sc.nextInt();
                String[] item=new String[num1];
                double[] price=new double[num1];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i=0;i<num1;i++){
                    System.out.println((i+1)+") Item Name:");
                    item[i]=sc.next();
                    System.out.println("1Item price:");
                    price[i]=sc.nextDouble();
                }
                cust=new PrimeCustomer(name1);
                generateBill(cust,price);
            }
            case 3->{
                System.out.println("Enter your Name :");
                String name2= sc.next();
                System.out.println("Enter number of Items :");
                int num2= sc.nextInt();
                String[] items =new String[num2];
                double[] price=new double[num2];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i=0;i<num2;i++){
                    System.out.println((i+1)+") Item Name:");
                    items[i]=sc.next();
                    System.out.println(" Item price:");
                    price[i]=sc.nextDouble();
                }
               cust= new VIP_Customer(name2);
                generateBill(cust,price);
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }

    }

}
