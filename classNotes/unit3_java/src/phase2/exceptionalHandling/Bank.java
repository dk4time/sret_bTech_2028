package phase2.exceptionalHandling;

public class Bank {

    static void withdraw(double balance, double amount) {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        System.out.println("Withdrawal Successful: " + amount);
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Transaction finished");
    }
}

