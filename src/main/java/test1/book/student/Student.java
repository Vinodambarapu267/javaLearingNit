package test1.book.student;

public class Student {
    private  String name;
    private  int age;

    public Student(String name, int age) {
        if(age<0){
            System.out.println("err");
        }

        this.name = name;
        this.age = age;
    }

    public Student(Student s){
        s = new Student(name,age);
        this.name = s.name;
        this.age = s.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){

        System.out.println("name :"+getName());
        System.out.println("Age:"+getAge());
    }
}
