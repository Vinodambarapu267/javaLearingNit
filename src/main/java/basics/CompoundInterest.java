package basics;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Principal Amount: ");
        int principal_Amount = scanner.nextInt();
        System.out.println("Enter a Rate of interest");
        float rateOfInt = scanner.nextFloat();
        int time = 3;
        float totalAmount = (float) ((float) principal_Amount * Math.pow((1 + rateOfInt/100),time));
        System.out.println("Total Amount : "+totalAmount);
    }
}
