package CallbackN3;

import CallbackN3.exceptions.PaymentException;

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethodCallback paymentMethod) {

        System.out.println("Processing payment... ");

        try{
            paymentMethod.pay(amount);
            System.out.println("Accept");
        }catch (PaymentException e){
            System.out.println("Error: " + e.getMessage() + "\n");
        }
    }

}

