package phase2.methodOverloading;

public class Calculator {

    // -----------------------------------
    // Method Overloading Examples
    // -----------------------------------

    int add(int a, int b) {
        System.out.println("add(int, int)");
        return a + b;
    }

    float add(int a, float b) {
        System.out.println("add(int, float)");
        return a + b;
    }

    float add(float a, int b) {
        System.out.println("add(float, int)");
        return a + b;
    }

    /*
     * IMPORTANT NOTE (INTERVIEW GOLD):
     *
     * This method is added to AVOID ambiguity caused by
     * TYPE PROMOTION.
     *
     * If add(double, double) is NOT present, then a call like:
     *
     *      add(10, 20.5);
     *
     * will cause a COMPILATION ERROR due to ambiguity, because:
     *
     * 10     → can be promoted to float or double
     * 20.5   → is double by default
     *
     * Java cannot choose between:
     *   add(int, float)
     *   add(float, int)
     *
     * Hence, we explicitly define:
     *   add(double, double)
     *
     * This removes ambiguity and gives Java a clear target.
     */
    double add(double a, double b) {
        System.out.println("add(double, double)");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("add(int, int, int)");
        return a + b + c;
    }

    double add(double nums[]) {
        System.out.println("add(double[])");

        double sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }
}

