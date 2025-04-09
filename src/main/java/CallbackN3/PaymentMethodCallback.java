package CallbackN3;

import CallbackN3.exceptions.PaymentException;

public interface PaymentMethodCallback {
    public void pay(double amount) throws PaymentException;
}

