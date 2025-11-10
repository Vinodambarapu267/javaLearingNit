package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee arr[] = {new Employee(4,"asif",4749),new Employee(1,"ashish",6454),new Employee(2,"xyz",7463)};
        for (Employee x : arr){
            System.out.println(x);
        }
        Arrays.sort(arr, Comparator.comparing(d->d.name));
        for (Employee y : arr ){
            System.out.println(y);
        }
        Arrays.sort(arr,Comparator.comparing(d->d.salary));
        for (Employee e : arr){
            System.out.println(e);
        }
    }
}
