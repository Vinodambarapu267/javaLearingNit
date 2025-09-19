package functional_programming;
/*
* PredicateMainClass
Write a Java program that defines a method testPredicate to test a given number against a provided predicate.

Class Name: CalculationLogic (ELC)

Method Name: testPredicate

Access Modifier: public

Non-Access Modifier: static

Return Type: boolean

Parameters: (int, Predicate<Integer>)

This method should return a boolean value indicating whether the given number satisfies the provided predicate.

In the main method:

Define three predicates:

isEven: Checks if a given number is even.

isGreaterThanTen: Checks if a given number is greater than 10.

isPrime: Verify whether a given number is prime or not.

Read an integer input from the user.

Test each predicate using the testPredicate method and print the result.

Input Format

A single integer number.

Output Format

Print results in the following format:

<number> is even: <true/false>
<number> is greater than 10: <true/false>
<number> is prime: <true/false>
* */
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateMainClass {
    public static boolean testPredicate(int num, Predicate<Integer>predicate){
        return predicate.test(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Predicate<Integer> evenPredicate = n->isEven(n);
        Predicate<Integer> greaterThanTenPredicate =n->isGreaterThan(n);
        Predicate<Integer> primePredicate = n->isPrime(n);
        System.out.println(number+" is even: "+testPredicate(number,evenPredicate));
        System.out.println(number+" is greater than 10: "+testPredicate(number,greaterThanTenPredicate));
        System.out.println(number+" is prime: "+testPredicate(number,primePredicate));
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static boolean isGreaterThan(int num){
        return num>10;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}
