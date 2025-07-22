package blcandelclogic.next_multiple;

public class NextMultipleOfHundred {
    public static  int multiple(int s){
        int nextMul = (((s/100)+1)*100);
        return nextMul;
    }
}
