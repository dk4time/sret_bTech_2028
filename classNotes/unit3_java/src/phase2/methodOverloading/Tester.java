package phase2.methodOverloading;

public class Tester {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // -----------------------------------
        // 1. Exact Match Calls
        // -----------------------------------
        calc.add(10, 20);              // add(int, int)
        calc.add(10, 20.5f);           // add(int, float)
        calc.add(10.5f, 20);           // add(float, int)
        calc.add(10, 20, 30);          // add(int, int, int)

        // -----------------------------------
        // 2. Type Promotion
        // -----------------------------------
        /*
         * int → double
         * This directly matches add(double, double)
         */
        calc.add(10, 20.5);            // add(double, double)

        // -----------------------------------
        // 3. Why add(double, double) is IMPORTANT
        // -----------------------------------
        /*
         * If add(double, double) was NOT present,
         * the below call would cause a COMPILATION ERROR
         * due to ambiguity:
         *
         * calc.add(10, 20.5);
         *
         * Reason:
         * 10    → can be promoted to float or double
         * 20.5  → double
         *
         * Java cannot decide between:
         * add(int, float)
         * add(float, int)
         *
         * Hence add(double, double) removes ambiguity.
         */

        // -----------------------------------
        // 4. Explicit Casting to Control Method Selection
        // -----------------------------------
        calc.add((double) 10, (double) 20);  // add(double, double)
        calc.add(10, (float) 20);             // add(int, float)

        // -----------------------------------
        // 5. Array Version
        // -----------------------------------
        double nums[] = {10.5, 20.5, 30.5};
        System.out.println("Sum of array: " + calc.add(nums));
    }
}
