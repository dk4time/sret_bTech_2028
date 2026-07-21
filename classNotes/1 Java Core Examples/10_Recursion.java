/*
 * Topic: Recursion
 * Core idea: a base case plus progress toward it, same as any language. The
 * Java-specific addition here is memoization via HashMap - naive recursive
 * Fibonacci's exponential blow-up is a classic placement interview question.
 */

import java.util.HashMap;
import java.util.Map;

public class Recursion {

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Naive - O(2^n), recomputes the same subproblems repeatedly
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Memoized - O(n), each subproblem solved once and cached
    static int fibonacciMemo(int n, Map<Integer, Integer> cache) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);
        int result = fibonacciMemo(n - 1, cache) + fibonacciMemo(n - 2, cache);
        cache.put(n, result);
        return result;
    }

    static String reverse(String text) {
        if (text.isEmpty()) return "";
        return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
    }

    static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(7));
        System.out.println(fibonacciMemo(30, new HashMap<>()));
        System.out.println(reverse("java"));
        System.out.println(power(2, 5));
    }
}
