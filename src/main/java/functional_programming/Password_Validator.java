package functional_programming;
import java.util.Random;
import java.util.function.Supplier;

public class Password_Validator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "@#$%!&*";
        String passwordGen = upper+lower+digits+special;
        Random rr = new Random();
        Supplier<String> pwdSupplier =()->{
            String pwd = "";
            for (int i=0;i<8;i++){
                int index= rr.nextInt(passwordGen.length());
                pwd = pwd+passwordGen.charAt(index);
            }
            return pwd;
        };
        String password = pwdSupplier.get();
        System.out.println("Generated Password is : "+password);
    }
}
