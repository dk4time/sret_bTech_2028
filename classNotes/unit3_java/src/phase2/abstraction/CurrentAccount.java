package phase2.abstraction;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance + 10000) {  // overdraft allowed
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount);
        } else {
            System.out.println("Current Overdraft Limit Exceeded");
        }
    }
}

