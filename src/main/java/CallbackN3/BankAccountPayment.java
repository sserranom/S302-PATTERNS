package CallbackN3;

import CallbackN3.exceptions.InsufficientfundsException;
import CallbackN3.exceptions.PaymentException;

public class BankAccountPayment implements PaymentMethodCallback {
    @Override
    public void pay(double amount) throws PaymentException {
        double simulatedBalance = 200.00;

        if (simulatedBalance < amount) throw new InsufficientfundsException();
            System.out.println("Paying " + amount + " By bank transfer");

    }
}
