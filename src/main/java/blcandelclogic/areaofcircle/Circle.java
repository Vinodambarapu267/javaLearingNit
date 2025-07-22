package blcandelclogic.areaofcircle;

public class Circle {
    public static String area(double r){
        final  double Pi = 3.14;
        double area = Pi*r*r;
        if(r<=0){
            return String.valueOf(0);
        }
        else {
            return String.valueOf(area);
        }
    }

}
