package polymorphism.shoping_mall_application;

public class GenralCustomer extends Customer {
    public GenralCustomer(String name) {
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
        System.out.println("Total Cost:  "+total);
        System.out.println("Discount: No discount for general customers.");
    }
}
