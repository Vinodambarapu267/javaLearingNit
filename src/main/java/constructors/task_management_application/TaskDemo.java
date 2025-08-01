package constructors.task_management_application;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task("Complete Project","Finish the Java project by Friday","high",false);
        System.out.println("Title: "+task.getTitle());
        System.out.println("Description: "+task.getDescription());
        System.out.println("Priority: "+task.getPriority());
        System.out.println("Is Completed: "+task.isCompleted());
        System.out.println("After update");
        task =new Task("Complete project","Finish the updated Java project by Thursday","Medium",true);
        System.out.println("Title: "+task.getTitle());
        System.out.println("Description: "+task.getDescription());
        System.out.println("priority: "+task.getPriority());
        System.out.println("Is Completed: "+task.isCompleted());
    }

}
