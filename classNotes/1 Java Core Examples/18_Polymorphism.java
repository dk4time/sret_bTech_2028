/*
 * Topic: Polymorphism
 * Core idea: Java has two distinct kinds worth naming separately -
 * compile-time (method overloading, resolved from argument types by the
 * compiler) and runtime (method overriding, resolved from the actual object
 * type during execution).
 *
 * Real World Example: Payment Gateway
 */

import java.util.List;

public class Polymorphism {

    // Compile-time polymorphism: overloading
    static class Payment {
        void pay(int amount) {
            System.out.println("Paying " + amount + " in cash");
        }

        void pay(int amount, String cardNumber) {
            System.out.println("Paying " + amount + " with card " + cardNumber);
        }
    }

    // Runtime polymorphism: overriding
    static class CreditCardPayment extends Payment {
        @Override
        void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class UpiPayment extends Payment {
        @Override
        void pay(int amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay(500);
        payment.pay(500, "1234-5678");

        // Each call dispatches based on the ACTUAL object, even though every
        // reference here is typed as Payment
        List<Payment> payments = List.of(new CreditCardPayment(), new UpiPayment());
        for (Payment p : payments) {
            p.pay(1000);
        }

        // String.length() is a method; array.length is a field - Java is
        // less uniform here than Python's single len().
        System.out.println("Java".length());
        int[] numbers = {10, 20, 30};
        System.out.println(numbers.length);
    }
}
