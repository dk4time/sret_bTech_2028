package phase2.abstraction;

public class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {

        if (Payment.validateAmount(amount)) {
            System.out.println("UPI payment of " + amount);
            paymentStatus(true);
        } else {
            paymentStatus(false);
        }
    }
}

