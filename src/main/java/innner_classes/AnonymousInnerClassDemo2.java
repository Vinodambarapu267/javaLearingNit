package innner_classes;
class Super{
    public void display(){
        System.out.println("Super class display Method");
    }
        }
public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {

        Super sub = new Super(){
            @Override
            public void display() {
            super.display();
                System.out.println("sub class display method");
            }
        };

sub.display();

    }
}
