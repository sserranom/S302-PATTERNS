    package CallbackN3;

    public class Main {
        public static void main(String[] args) {
            PaymentGateway paymentGateway = new PaymentGateway();
            ShoeStore shoeStore = new ShoeStore(paymentGateway);

            PaymentMethodCallback  creditCardPayment = new CreditCardPayment();
            PaymentMethodCallback payPayPayment = new PaypalPayment();
            PaymentMethodCallback bankAccountPayment = new BankAccountPayment();

            Shoe nike = new Shoe("Nike", 40.5, "A12345", 125.00);
            Shoe adidas = new Shoe("Adidas", 44.00, "A654321", 200.00);
            shoeStore.addShoes(nike);
            shoeStore.addShoes(adidas);

            System.out.println("\n--- Payment with Credit Card ---");
            shoeStore.bill(creditCardPayment);

            System.out.println("\n--- Payment with PayPal ---");
            shoeStore.bill(payPayPayment);

            System.out.println("\n--- Payment with Bank Transfer ---");
            shoeStore.bill(bankAccountPayment);
        }
    }
