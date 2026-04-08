package phase1.operators;

public class Example1 {

    public static void main(String[] args) {

        // -----------------------------------
        // 1. Alternating Player Logic
        // -----------------------------------
        int player = 1;   // current player (1 or 2)
        int n = 10;       // number of turns

        while (n > 0) {

            // Print current player
            System.out.println("Player " + player);

            // Decrease number of turns
            n--;

            // Toggle player between 1 and 2
            // If player = 1 → 1 % 2 + 1 = 2
            // If player = 2 → 2 % 2 + 1 = 1
            player = player % 2 + 1;
        }

        // -----------------------------------
        // 2. Increment Operators
        // -----------------------------------
        int a = 10;

        a++;   // Post-increment → value increases AFTER expression
        ++a;   // Pre-increment  → value increases BEFORE expression

        System.out.println("a: " + a); // a = 12

        // a++ > 12
        // Step 1: use current value of a (12)
        // Step 2: compare 12 > 12 → false
        // Step 3: increment a → a becomes 13
        System.out.println("PostInc: " + (a++ > 12));

        System.out.println("a: " + a); // a = 13

        // -----------------------------------
        // 3. Compound Assignment Operators
        // -----------------------------------
        int result = 0;

        result += 10;          // result = result + 10 → 10
        result += a + 30;      // result = result + a + 30
        result -= a + 30;      // result = result - (a + 30)

        System.out.println("result: " + result);

        // -----------------------------------
        // 4. Logical AND (&&) – Short Circuit
        // -----------------------------------
        int b = 10;

        // b++ > 10 → 10 > 10 → false
        // Because first condition is false,
        // ++b > 10 is NOT executed (short-circuit)
        if (b++ > 10 && ++b > 10)
            System.out.println("Logical AND: true");
        else
            System.out.println("Logical AND: false");

        System.out.println("b: " + b); // b = 11

        // -----------------------------------
        // 5. Logical OR (||) – Short Circuit
        // -----------------------------------
        int c = 10;

        // c++ > 9 → true
        // Second condition NOT evaluated
        if (c++ > 9 || ++c > 10)
            System.out.println("Logical OR: true");

        System.out.println("c: " + c); // c = 11

        // -----------------------------------
        // 6. Ternary Operator
        // -----------------------------------
        int x = 5;

        // condition ? value_if_true : value_if_false
        String type = (x % 2 == 0) ? "Even" : "Odd";

        System.out.println("x is: " + type);

        // -----------------------------------
        // 7. Bitwise Operator (Preview)
        // -----------------------------------
        int p = 5;   // 0101
        int q = 3;   // 0011

        System.out.println("Bitwise AND: " + (p & q)); // 0001 → 1
        System.out.println("Bitwise OR: " + (p | q));  // 0111 → 7
    }
}
