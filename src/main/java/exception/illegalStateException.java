package exception;

public class illegalStateException {
    static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            System.out.println("Caught: " + objA);
        }
    }

    public static void main(String[] args) {
illegalStateException.throwIllegalException();
    }



}
