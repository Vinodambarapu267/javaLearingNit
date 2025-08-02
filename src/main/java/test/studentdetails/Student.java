package test.studentdetails;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public  void Display(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

}
