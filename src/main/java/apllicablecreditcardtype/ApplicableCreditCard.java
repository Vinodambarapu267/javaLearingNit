package apllicablecreditcardtype;

import java.util.Scanner;

public class ApplicableCreditCard {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Customer Name:");
        String  name=scanner.next();
        System.out.println("Enter your Credit Points: ");
        int creditPoints = scanner.nextInt();
        Customer c1= new Customer(name,creditPoints);
        CardType offeredCard = CardOnOffer.getOfferedCard(c1);
        System.out.println(offeredCard);
    }
}
