package basics;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a selling price : ");
        int  selling =scanner.nextInt();
        System.out.print("Enter a cost Price : ");
         int cost = scanner.nextInt();
        //profit
        int profit = selling-cost;
        //lose
        int loss = cost-selling;
        if(cost <selling){
            System.out.println(profit);
            float profitPer = (float)(profit/cost)*100;
            System.out.println("profit: "+profitPer+"%");
        }
        else{
            System.out.println(loss);
        float lossPer = (float)(loss*100)/cost;
        System.out.println("loss : "+ lossPer+"%");}
    }
}
