package oopsconcepts.elc;

import oopsconcepts.blc.Employeee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String firstName =sc.next();

        String lastname = sc.next();

        int id =Integer.parseInt(sc.next());

        double salary = Double.parseDouble(sc.next());

        int noOfProjects = Integer.parseInt(sc.next());
        Employeee employeee1= new Employeee();
        employeee1.setEmployeeData(firstName,lastname,id,salary, noOfProjects);
        employeee1.updateSalary();
        System.out.println(employeee1);
    }
}
