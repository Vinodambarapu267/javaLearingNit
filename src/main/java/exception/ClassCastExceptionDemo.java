package exception;
import java.util.Objects;
public class ClassCastExceptionDemo {


    public static void handleClassCastException(Object []objects) {
        for (Object a : objects) {

            try {
                String str = (String) a;
                System.out.println("Casting successful: " + str);
            } catch (Exception e) {
                System.err.println("ClassCastException : Cannot cast " + a.getClass().getName() + "to String.");
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       handleClassCastException(new Object[]{"Hello",1123,"java"});

    }

}
