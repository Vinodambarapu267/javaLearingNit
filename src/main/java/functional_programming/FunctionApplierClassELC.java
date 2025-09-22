package functional_programming;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplierClassELC {

    public static int applyFun(int value,Function<Integer,Integer> f){

        return f.apply(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        Function<Integer,Integer> adding = num->
                num+5;
        int add = FunctionApplierClassELC.applyFun(inp, adding);


        Function<Integer,Integer> multiplying= num->
                num*2;
        int mul = FunctionApplierClassELC.applyFun(inp,multiplying);
        Function<Integer,Integer> subtracting = num->
                num-3;
        int sub= FunctionApplierClassELC.applyFun(inp,subtracting);
        System.out.println("Original value: "+inp);
        System.out.println("After adding 5: "+add);
        System.out.println("After multiplying by 2: "+mul);
        System.out.println("After subtracting 3: "+sub);
    }
}
