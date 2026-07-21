/*
 * Topic: Encapsulation
 * Core idea: keep fields `private` and expose controlled access through
 * public getters/setters. A public field can never enforce a rule; a setter
 * can. This is the habit worth building, more than the syntax itself.
 */

public class Encapsulation {

    static class BankAccount {

        private double balance;   // cannot be touched directly from outside

        BankAccount(double openingBalance) {
            this.balance = openingBalance;
        }

        double getBalance() {
            return balance;
        }

        void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount > balance) {
                throw new IllegalStateException("Insufficient balance");
            }
            balance -= amount;
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        // account.balance = -5000;   // would not compile - the field is private

        account.deposit(500);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());

        try {
            account.withdraw(100000);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
