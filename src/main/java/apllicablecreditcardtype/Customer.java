package apllicablecreditcardtype;

public class Customer {
    private String customerName;
    private int creditPoints;

    public Customer(String customerId, int creditPoints) {
        this.customerName = customerId;
        this.creditPoints = creditPoints;
    }
    public int getCreditPoints(){
        return  this.creditPoints;
    }

    @Override
    public String toString() {
        return this.customerName ;
    }
}

