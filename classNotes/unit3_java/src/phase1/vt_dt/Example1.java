package phase1.vt_dt;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Basic Output
        // -------------------------------
        System.out.println("Welcome to Java");

        // -------------------------------
        // 2. Variable Declaration
        // -------------------------------
        int a, b;   // integer variables

        // Scanner object to take input from keyboard
        Scanner scan = new Scanner(System.in);

        // Reading integer inputs
        a = scan.nextInt();
        b = scan.nextInt();

        // Reading double input
        double d = scan.nextDouble();

        // Printing values
        System.out.println("a and b: " + a + " " + b);

        // -------------------------------
        // 3. Variable Naming Rules
        // -------------------------------
        // Allowed characters: letters, digits, _, $
        // Cannot start with a digit
        int aA1_$;   // valid variable name

        // -------------------------------
        // 4. Primitive Data Types
        // -------------------------------
        /*
         byte    -> 1 byte
         short   -> 2 bytes
         int     -> 4 bytes
         long    -> 8 bytes
         float   -> 4 bytes
         double  -> 8 bytes
         char    -> 2 bytes (Unicode)
         boolean -> true / false
        */

        int i = 10;
        long l = 10000000000L;   // L or l is mandatory for long literals
        double db = 12.8;
        float f = 12.8f;         // f is mandatory for float literals

        // -------------------------------
        // 5. Type Conversion (Type Casting)
        // -------------------------------

        // ===== Implicit Type Conversion (Widening) =====

        // 1. Small data type to larger data type
        float i_f = 10;  // int → float
        System.out.println("Float: " + i_f);

        // 2. Expression evaluation (largest data type wins)
        float avg = 13 / 2.0f;   // int / float → float
        System.out.println("Average: " + avg);

        // 3. int to char and char to int
        int ch_i = 'a';          // ASCII value of 'a' = 97
        char i_ch = 98;          // 98 → 'b'
        System.out.println("Character: " + i_ch);

        // ===== Explicit Type Conversion (Narrowing) =====

        // 1. Large data type to smaller data type
        long f_l = (long) 12.5f; // decimal part is lost
        System.out.println("Long: " + f_l);

        // 2. Out of range conversion (Data Loss)
        // byte range: -128 to 127
        byte by = (byte) 130;    // overflow occurs
        System.out.println("Byte: " + by);

        // -------------------------------
        // 6. Good Practice
        // -------------------------------
        // Always close the Scanner to avoid resource leak
        scan.close();
    }
}
