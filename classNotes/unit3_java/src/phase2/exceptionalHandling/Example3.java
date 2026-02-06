package phase2.exceptionalHandling;

public class Example3 {

    public static void main(String[] args) {

        try {
            System.out.println("Outer try block");

            try {
                int arr[] = {1, 2, 3};
                System.out.println(arr[10]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array issue");
            }

            int a = 10 / 0;   // ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero");
        }

        System.out.println("Program completed");
    }
}

