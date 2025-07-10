package Basics;

public class GenerateBill {
    public static void main(String[] args) {
        int chickenRolls = Integer.parseInt(args[0]);
        int chickenRollsCost = 4*60;
        int vegRolls = Integer.parseInt(args[1]);
        int vegRollsCost = 3*25;
        int totalCost = vegRollsCost + chickenRollsCost;
        int finalBill = totalCost-50;
        System.out.println("No.of Vegrolls : "+vegRolls);
        System.out.println("No.of ChickenRolls : "+chickenRolls);
        System.out.println("TotalCost : "+totalCost);
        System.out.println("finalBill : "+finalBill);

    }
}
