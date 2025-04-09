package CallbackN3.exceptions;

public class ServiceUnavailableException extends PaymentException{
    public ServiceUnavailableException(String message) {
        super("The service is not available at this time.");
    }
}
