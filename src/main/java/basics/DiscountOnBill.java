package basics;

import java.util.Scanner;

public class DiscountOnBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Bill: ");
        int bill =scanner.nextInt();
        float discount;
        int amountPayable;
        if(bill < 5000){
            discount =(float) (bill*5)/100;
            amountPayable = (int) ( bill-discount);
            System.out.println("Discount :"+discount);
            System.out.println("Amount payable: "+amountPayable);
        }
        else if(bill >= 5000 && bill<10000){
            discount = (float) (bill*10)/100;
            amountPayable =(int) (bill - discount);
            System.out.println("Discount :"+discount);
            System.out.println("Amount payable: "+amountPayable);
        }
        else {
            discount = (float) (bill*15)/100;
            amountPayable =(int) (bill-discount);
            System.out.println("Discount :"+discount);
            System.out.println("Amount payable: "+amountPayable);
        }
    }
}
