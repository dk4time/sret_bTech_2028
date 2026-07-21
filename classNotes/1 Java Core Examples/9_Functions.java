/*
 * Topic: Functions (Java methods)
 * Core idea: every Java method belongs to a class. The two ideas that matter
 * most - and that most intro courses gloss over - are method overloading
 * (same name, different parameter lists, resolved at compile time) and the
 * static vs. instance distinction.
 */

import java.util.Arrays;

public class Functions {

    // Overloading - the compiler picks the right version from the arguments
    static int power(int number) {
        return power(number, 2);
    }

    static int power(int number, int exponent) {
        return (int) Math.pow(number, exponent);
    }

    // Varargs - variable number of arguments
    static int total(int... numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }

    // Static method - belongs to the class, no object needed
    static void staticGreeting() {
        System.out.println("Welcome to Java (static, no object needed)");
    }

    // Instance method - belongs to a specific object, can use `this`
    int instanceId;

    Functions(int instanceId) {
        this.instanceId = instanceId;
    }

    void instanceGreeting() {
        System.out.println("Welcome from instance #" + this.instanceId);
    }

    // Returning more than one value - group them, don't fake a tuple
    record SumDiff(int sum, int diff) {}

    static SumDiff calculate(int a, int b) {
        return new SumDiff(a + b, a - b);
    }

    public static void main(String[] args) {

        staticGreeting();

        Functions instance = new Functions(1);
        instance.instanceGreeting();

        System.out.println(power(5));
        System.out.println(power(5, 3));

        System.out.println(total(10, 20));
        System.out.println(total(10, 20, 30, 40));

        SumDiff result = calculate(20, 10);
        System.out.println(result.sum() + " " + result.diff());

        int[] numbers = {10, 20, 30, 40};
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        System.out.println(Arrays.stream(numbers).sum());
    }
}
