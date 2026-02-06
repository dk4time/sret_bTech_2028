package phase2.abstraction;

public interface Payment {

    // -----------------------------------
    // Abstract method (must be implemented)
    // -----------------------------------
    void pay(double amount);

    // -----------------------------------
    // default method (common implementation)
    // -----------------------------------
    default void paymentStatus(boolean success) {
        log();   // calling private method
        if (success)
            System.out.println("Payment Successful");
        else
            System.out.println("Payment Failed");
    }

    // -----------------------------------
    // static method (utility, common to all)
    // -----------------------------------
    static boolean validateAmount(double amount) {
        return amount > 0;
    }

    // -----------------------------------
    // private method (helper for default methods)
    // -----------------------------------
    private void log() {
        System.out.println("Transaction initiated...");
    }
}


