package phase1.control_st;

public class PowerJumper {

    public static void main(String[] args) {

        // -----------------------------------
        // Target distance to be covered
        // -----------------------------------
        int distance = 10;

        /*
         * j1, j2   → previous two jump powers (Fibonacci style)
         * power    → current jump power
         * dist     → distance covered so far
         * steps    → number of steps taken
         */
        int j1 = 0, j2 = 1;
        int power = 1;
        int dist = 1;
        int steps = 1;

        // Edge case: if distance is zero, no steps needed
        if (distance == 0)
            steps = 0;

        // -----------------------------------
        // Loop until required distance is reached
        // -----------------------------------
        while (dist != distance) {

            // Generate next jump power
            power = j1 + j2;

            /*
             * Check if next jump can be taken
             * without crossing the target distance
             */
            if (dist + power <= distance) {

                // Take the jump
                dist += power;

                // Move Fibonacci window forward
                j1 = j2;
                j2 = power;

                // One successful step taken
                steps++;
            } else {

                /*
                 * If jump exceeds distance:
                 * - reset jump powers
                 * - take extra penalty steps
                 */
                j1 = 0;
                j2 = 1;

                steps += 2;
            }
        }

        // Final output
        System.out.println("Steps: " + steps);
    }
}
