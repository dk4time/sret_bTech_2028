/*
 * Topic: Exception Handling
 * Core idea: Java draws a hard line between checked exceptions (the compiler
 * forces you to handle or declare them, e.g. IOException) and unchecked
 * exceptions (RuntimeException and subclasses, which compile fine even if
 * unhandled). That distinction drives most of Java's exception design.
 */

public class ExceptionHandling {

    // Custom CHECKED exception - callers are forced to handle or declare it
    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Cannot withdraw " + amount + " from balance " + balance);
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        // Unchecked - ArithmeticException is a RuntimeException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        // Multi-catch
        try {
            Object[] items = new String[3];
            items[0] = 100;   // throws ArrayStoreException at runtime
        } catch (ArrayStoreException | NullPointerException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
        }

        // finally always runs - Java has no try/else clause the way Python does
        try {
            System.out.println(10 / 2);
        } finally {
            System.out.println("Execution completed");
        }

        // Handling a custom CHECKED exception - the compiler requires this
        try {
            withdraw(1000, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Throwing an unchecked exception directly
        int age = -5;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
