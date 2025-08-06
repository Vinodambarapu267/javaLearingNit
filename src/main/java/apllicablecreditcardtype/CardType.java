package apllicablecreditcardtype;

public class CardType {
    private Customer customer;
    private String cardType;

    public CardType(Customer customer, String cardType) {
        this.customer = customer;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "The customer '"+this.customer+"' Is Eigible for '"+this.cardType+"'Card";
    }
}
