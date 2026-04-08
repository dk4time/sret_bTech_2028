package com.oops.com;

class ATM {

    double balance = 5000;

    void withdraw(double amount, int pin) {

        try {
            // Step 1: Check PIN
            if (pin != 1234) {
                throw new Exception("Invalid PIN");
            }

            // Step 2: Check balance
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }

            // Step 3: If everything is fine
            balance -= amount;
            System.out.println("Please collect your cash: " + amount);
            System.out.println("Remaining Balance: " + balance);

        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Card Ejected. Thank you for using ATM!");
        }
    }

    public static void main(String[] args) {
        ATM user = new ATM();

        // Try different scenarios by changing values
        user.withdraw(2000, 1234);   // Success
        user.withdraw(7000, 1234);   // Insufficient Balance
        user.withdraw(1000, 1111);   // Wrong PIN
    }
}