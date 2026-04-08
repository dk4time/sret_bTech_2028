package phase2.abstraction;

public abstract class BankAccount {

    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Concrete method (shared logic)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Abstract method (varies by account type)
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

