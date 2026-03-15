package phase2.exceptionalHandling;

public class Example2 {

    public static void main(String[] args) {

        try {
            String str = null;

            System.out.println(str.length());   // NullPointerException

            int arr[] = {10, 20};
            System.out.println(arr[5]);         // ArrayIndexOutOfBounds
        }
        catch (NullPointerException e) {
            System.out.println("Null reference accessed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (Exception e) {
            // Generic catch – should be LAST
            System.out.println("Some other exception");
        }

        System.out.println("Execution continues...");
    }
}

