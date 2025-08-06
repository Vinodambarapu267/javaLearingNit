package apllicablecreditcardtype;

public class CardOnOffer {

    public static CardType getOfferedCard(Customer cust){
        int creditPoints= cust.getCreditPoints();
        if(creditPoints>=100&&creditPoints<=500){
            return new CardType(cust,"silver");
        }else if(creditPoints>=501 &&creditPoints<1000){
            return new CardType(cust,"Gold");
        }else if(creditPoints>1000){
            return  new CardType(cust,"platinum");
        }else {
            return  new CardType(cust,"EMI");
        }
    }
}
