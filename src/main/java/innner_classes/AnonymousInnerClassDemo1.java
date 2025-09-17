package innner_classes;
class Bird{
    public void roam(){
        System.out.println("Generic Bird is roaming");
    }
}
public class AnonymousInnerClassDemo1 {
    public static void main(String[] args) {
        //Anonymouse Inner Class
        Bird parrot = new Bird(){
          public void roam(){
              System.out.println("Parrot bird is roaming");
          }
        };
        Bird sparrow = new Bird(){
            public void roam(){
                System.out.println("Parrot bird is roaming");
            }

            public void m1(){}
        };
        parrot.roam();
        sparrow.roam();

    }
}
