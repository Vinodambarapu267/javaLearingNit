package abstraction.interfaces.interface_static_method.calculator;

interface Calculator {
    static double doSum(double x ,double y){
        return (x+y);
    }
    static double getSquare(int num){
        return (num*num);
    }
}
