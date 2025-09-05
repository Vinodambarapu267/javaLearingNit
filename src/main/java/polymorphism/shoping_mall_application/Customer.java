package polymorphism.shoping_mall_application;

public class Customer {
    protected String name;

    public Customer(String name) {
        if(name.isEmpty()||name==null){
            System.out.println("");
        }
        this.name = name;
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
        System.out.println("Customer"+name);
        System.out.println("Total Cost "+total);
    }
}
