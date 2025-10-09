package exception.bank_application.exceptions;

public class LoanNotAllowedException extends Exception{
    public LoanNotAllowedException(String message) {
        super(message);
    }
}
