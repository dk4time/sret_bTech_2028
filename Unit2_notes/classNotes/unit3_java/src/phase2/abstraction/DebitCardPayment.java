package phase2.abstraction;

public class DebitCardPayment implements Payment {

    @Override
    public void pay(double amount) {

        if (Payment.validateAmount(amount)) {
            System.out.println("Debit Card payment of " + amount);
            paymentStatus(true);
        } else {
            paymentStatus(false);
        }
    }
}

