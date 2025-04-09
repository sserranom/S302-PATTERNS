package CallbackN3;

import CallbackN3.exceptions.InsufficientfundsException;
import CallbackN3.exceptions.PaymentException;

public class CreditCardPayment implements PaymentMethodCallback {

    @Override
    public void pay(double amount) throws PaymentException {

        double simulatedBalance = 350.00;

        if (simulatedBalance < amount) throw new InsufficientfundsException();
            System.out.println("Paying " + amount + " With credit card");

    }
}