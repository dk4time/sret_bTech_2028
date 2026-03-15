package phase2.abstraction;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {

        if (Payment.validateAmount(amount)) {
            System.out.println("Credit Card payment of " + amount);
            paymentStatus(true);
        } else {
            paymentStatus(false);
        }
    }
}

