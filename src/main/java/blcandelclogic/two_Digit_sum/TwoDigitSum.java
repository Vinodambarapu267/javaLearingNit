package blcandelclogic.two_Digit_sum;

public class TwoDigitSum {
    public static  int sum(int x){
        int sum =x%10+x/10;
        System.out.println(sum);
        int difference = x/10- x%10 ;
        System.out.println(difference);
        return sum;
    }

}
