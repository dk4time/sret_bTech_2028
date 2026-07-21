/*
 * Topic: Variables
 * Core idea: every Java variable has a fixed, declared type - the compiler
 * enforces it before the program ever runs. This file focuses on what that
 * means in practice: declaration, constants, and scope.
 */

public class Variables {

    // Class-level constant - Java's idiomatic way to define a fixed value
    static final double TAX_RATE = 0.18;

    public static void main(String[] args) {

        String name = "Dinesh";
        int age = 28;
        double salary = 55000.75;
        System.out.println(name + " " + age + " " + salary);

        // Multiple declaration, same type, one line
        int x = 10, y = 20, z = 30;
        System.out.println(x + " " + y + " " + z);

        // Chained assignment
        int a, b, c;
        a = b = c = 100;
        System.out.println(a + " " + b + " " + c);

        // Primitive vs reference types: primitives copy by value
        int primitiveCopy = age;
        primitiveCopy = 99;
        System.out.println("age stays unchanged: " + age);

        // Using a constant
        double price = 1000;
        System.out.println("Price with tax: " + (price + price * TAX_RATE));

        // camelCase is Java's naming convention
        String studentName = "John";
        System.out.println(studentName);

        // Swapping needs a temp variable - no tuple-unpacking swap in Java
        int first = 10, second = 20;
        int temp = first;
        first = second;
        second = temp;
        System.out.println("After swap: " + first + " " + second);

        // Scope - a block-local variable dies when its { } block ends
        {
            String blockScoped = "Only visible in this block";
            System.out.println(blockScoped);
        }
    }
}
