package phase1.control_st;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 29;   // number to check

        // 0 and 1 are not prime
        if (n <= 1) {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }

        // 2 is the only even prime number
        if (n == 2) {
            System.out.println(n + " is a Prime Number");
            return;
        }

        // Any other even number is NOT prime
        if (n % 2 == 0) {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }

        /*
         * Now we check ONLY ODD divisors
         * Start from 3
         * Increment by 2 (skip even numbers)
         * Loop runs till sqrt(n)
         */
        boolean isPrime = true;

        for (int i = 3; i * i <= n; i += 2) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Final result
        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");
    }
}
