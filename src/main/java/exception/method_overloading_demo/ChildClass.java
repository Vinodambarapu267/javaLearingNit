package exception.method_overloading_demo;

public class ChildClass extends ParentClass{
    public void loadingClass(String className)throws ClassNotFoundException {
        Class.forName(className);
        if (className.isEmpty()||className==null){
            throw new IllegalStateException("class name cannot be empty");
        }
        try {
            super.loadingClass(className);
        }catch (ClassNotFoundException e){
            System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
            throw new RuntimeException("Unchecked Exception: RuntimeException from ChildClass");
        }
    }
}
