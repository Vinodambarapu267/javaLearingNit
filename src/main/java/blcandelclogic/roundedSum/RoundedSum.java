package blcandelclogic.roundedSum;

public class RoundedSum {
    public  static int rounded(int a, int b, int c){
     a = (a%10<=5)  ? a/10*10: (a/10+1)*10;
        b = (b%10<=5)  ? b/10*10: (b/10+1)*10;
        c = (c%10<=5)  ? c/10*10: (c/10+1)*10;
        int result =a+b+c;
        return result;
    }


}
