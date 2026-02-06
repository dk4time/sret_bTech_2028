package phase2.abstraction;

public class Tester {

    public static void main(String[] args) {

        // -----------------------------------
        // DATA BINDING – ABSTRACT CLASS
        // -----------------------------------
        BankAccount acc1 = new SavingsAccount("Dinesh", 10000);
        BankAccount acc2 = new CurrentAccount("Divya", 5000);

        acc1.deposit(2000);
        acc1.withdraw(3000);

        acc2.withdraw(12000);

        // -----------------------------------
        // DATA BINDING – INTERFACE
        // -----------------------------------
        Payment p1 = new UPIPayment();
        Payment p2 = new CreditCardPayment();
        Payment p3 = new DebitCardPayment();

        p1.pay(1500);
        p2.pay(5000);
        p3.pay(-100);   // invalid
    }
}

