package phase1.control_st;

public class Example1 {

    public static void main(String[] args) {

        /*
         * Loops are used to repeat a block of code
         *
         * Types of loops:
         * 1. for        → when range is known
         * 2. while      → when termination condition is known
         * 3. do-while   → executes at least once
         */

        // -----------------------------------
        // 1. for loop – Print first n natural numbers
        // -----------------------------------
        int n = 5;

        System.out.println("Natural Numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // -----------------------------------
        // 2. for loop – Factorial of a number
        // -----------------------------------
        int num = 5;
        double fact = 1;   // using double to avoid overflow for larger values

        /*
         * Flow of for loop:
         * init → condition → body → increment
         */
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(num + "! = " + fact);
        System.out.println();

        // -----------------------------------
        // 3. while loop – Reverse a number
        // -----------------------------------
        int value = 1234;
        int reverse = 0;

        /*
         * while loop:
         * condition checked before entering loop
         */
        while (value > 0) {
            int digit = value % 10;
            reverse = reverse * 10 + digit;
            value /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        System.out.println();

        // -----------------------------------
        // 4. do-while loop – Executes at least once
        // -----------------------------------
        int count = 1;

        /*
         * do-while:
         * body executes first
         * condition checked later
         */
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 3);
    }
}

/*
 * LOOP STRUCTURE (Common for all loops)
 *
 * initialization
 * condition
 * increment / decrement
 *
 */
