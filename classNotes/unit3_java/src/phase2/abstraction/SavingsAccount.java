package phase2.abstraction;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Withdrawn: " + amount);
        } else {
            System.out.println("Savings Insufficient Balance");
        }
    }
}

