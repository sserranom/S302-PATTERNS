package CallbackN3.exceptions;

public class AuthenticationFailedException extends PaymentException{
    public AuthenticationFailedException(String message) {
        super("Authentication error");
    }
}
