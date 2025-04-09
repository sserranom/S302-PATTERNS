package CallbackN3;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    private PaymentGateway paymentGateway;
    List<Shoe> shoes = new ArrayList<>();

    public ShoeStore() {
    }

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void addShoes(Shoe shoe) {
        shoes.add(shoe);
    }

    public double calculateAmount() {
        double total = 0.0;
        for (Shoe item : shoes) {
            total += item.getPrice();
        }
        return total;

    }

    public void bill(PaymentMethodCallback paymentMethodCallback) {
        double amount = calculateAmount();
        paymentGateway.processPayment(amount, paymentMethodCallback);

    }

    @Override
    public String toString() {
        return "ShoeStore{" +
                "shoes=" + shoes +
                '}';
    }
}
