package CallbackN3.exceptions;

public class InsufficientfundsException extends PaymentException{
    public InsufficientfundsException() {
        super("Insufficient funds");
    }
}
