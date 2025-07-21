package basics;

public class ShopKeeperBuyATv {
    public static void main(String[] args) {
        int buyPrice = 32500;
        float profit = ((float) (buyPrice * 27) /100);
        float vAT = (float) ((buyPrice*12.7)/100);
        float service = (float)(buyPrice*3.87)/100;
        float totalSellingPrice = profit+buyPrice+vAT+service;
        System.out.println("Total selling Price "+totalSellingPrice);
        System.out.println("Profit : "+profit);


    }
}
