package phase1.conditional_st;

public class Example1 {

    public static void main(String[] args) {

        // -----------------------------------
        // 1. Perfect Square Check
        // -----------------------------------
        int n = 100;

        /*
         * Math.sqrt(n)        → square root of n (double)
         * (int)Math.sqrt(n)  → truncates decimal part
         * Math.pow(x, 2)     → square of x
         *
         * If square of truncated sqrt equals n,
         * then n is a perfect square
         */
        System.out.println(Math.pow((int) Math.sqrt(n), 2) == n);

        // if-else statement
        if (Math.pow((int) Math.sqrt(n), 2) == n)
            System.out.println(n + " is a perfect square");
        else
            System.out.println(n + " is not a perfect square");

        // -----------------------------------
        // 2. Find Largest of Three Numbers
        // -----------------------------------
        int a = 10, b = 34, c = 90;

        // -----------------------------------
        // 2.1 Nested if-else
        // -----------------------------------
        if (a > b) {
            if (a > c)
                System.out.println(a + " is the largest number");
            else            // c > a > b
                System.out.println(c + " is the largest number");
        } else {
            if (b > c)
                System.out.println(b + " is the largest number");
            else            // c > b > a
                System.out.println(c + " is the largest number");
        }

        // -----------------------------------
        // 2.2 else-if Ladder
        // -----------------------------------
        if (a > b && a > c)
            System.out.println(a + " is the largest number");
        else if (b > a && b > c)   // 🔧 FIXED BUG (was b>c && b>c)
            System.out.println(b + " is the largest number");
        else
            System.out.println(c + " is the largest number");

        // -----------------------------------
        // 2.3 Incremental Comparison Method
        // -----------------------------------
        int max = a;   // assume a is max initially

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println(max + " is the largest number");

        // -----------------------------------
        // 3. Ternary Operator (Bonus)
        // -----------------------------------
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest using ternary: " + largest);
    }
}

/*
 * Problem Solving Flow:
 * 1. Math logic
 * 2. Algorithm thinking
 * 3. Clean Java implementation
 */
