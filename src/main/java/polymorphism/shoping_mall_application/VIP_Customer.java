package polymorphism.shoping_mall_application;

public class VIP_Customer extends Customer{
    protected double discountRate=15.0;

    public VIP_Customer(String name) {
        super(name);
    }
    public void calculateBill(double... prices){
        double total=0;
        for(double items:prices){
            if(items<0){
                System.out.println("");
                System.exit(0);
            }
            total+=items;
        }
        System.out.println("Customer: "+name);
        System.out.println("Total Cost: "+total);
        double discount=(total*discountRate)/100;
        System.out.println("Discount: "+discount);
        System.out.println("Final Amount: "+(total-discount));
    }
}
