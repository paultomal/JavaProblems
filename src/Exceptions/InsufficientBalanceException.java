package Exceptions;

public class InsufficientBalanceException  extends Exception{
    public InsufficientBalanceException() {
        super("Insufficient Balance in your account");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
