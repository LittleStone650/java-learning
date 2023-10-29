package exceptions;

public class InsufficientFundsException extends Exception{
    // Checked -> Exception
    // Unchecked (runtime) -> RuntimeException
    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
