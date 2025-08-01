package constructors.task_management_application;

public class Task {
    private  String title;
    private String description;
    private String priority;
    private  boolean isCompleted;

    public Task(String title, String description, String priority,boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted =isCompleted;
    }

    public String getTitle() {
        if(title.isEmpty()){
            System.err.println("Is not valid string");
            System.exit(0);
        }
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }
public  boolean isCompleted(){
        return  this.isCompleted= true;
}
    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void updatePriority(String priority) {
        this.priority = priority;
    }
}
