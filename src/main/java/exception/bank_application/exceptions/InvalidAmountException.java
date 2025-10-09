package exception.bank_application.exceptions;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(String message) {
        super(message);
    }
}
