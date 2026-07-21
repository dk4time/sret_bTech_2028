/*
 * Topic: Control Statements (looping)
 * Core idea: for, while, and the enhanced for-each cover the same ground as
 * most languages - but do-while is Java-specific: it guarantees the body
 * runs at least once, which is worth teaching as its own concept, along with
 * break/continue and labeled loops for nested-loop control.
 */

public class Control {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Enhanced for-each
        for (char ch : "Java".toCharArray()) {
            System.out.println(ch);
        }

        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // do-while - runs the body once BEFORE checking the condition
        int attempt = 1;
        do {
            System.out.println("Attempt " + attempt);
            attempt++;
        } while (attempt <= 3);

        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        // Labeled break - escapes an OUTER loop from inside a nested one,
        // something plain break/continue cannot do
        outer:
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == 1 && col == 1) {
                    break outer;
                }
                System.out.println(row + " " + col);
            }
        }
    }
}
