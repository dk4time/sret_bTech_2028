package phase2.exceptionalHandling;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            int a = 10;
            int b = 0;

            // Risky code
            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        }
        finally {
            // Always executes
            System.out.println("Finally block executed");
        }

        System.out.println("Program Ended");
    }
}

