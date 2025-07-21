package basics;

public class CycleSelingPrice {
    public static void main(String[] args) {
        int price = 1200;
        int repair = 250;
        int coloring = 350;
        int accessories = 500;
        int costPrice = price+repair+coloring+accessories;
        int sellingPrice = costPrice+1500;
        System.out.println("Selling Price : "+sellingPrice);
    }
}
