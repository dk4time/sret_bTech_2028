/*
 * Topic: Operators
 * Core idea: the usual operator families, plus bitwise operators given their
 * own section - they're tested heavily in placement rounds and easy to skip
 * in an intro course.
 */

import java.util.ArrayList;
import java.util.List;

public class Operators {

    public static void main(String[] args) {

        int a = 20, b = 6;

        // Arithmetic
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);   // true division needs an explicit cast
        System.out.println(a / b);             // integer division truncates
        System.out.println(a % b);
        System.out.println(Math.pow(a, b));    // no ** operator in Java

        // Comparison
        System.out.println(a == b);
        System.out.println(a > b);

        // Logical
        boolean x = true, y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // Bitwise - frequently tested, rarely covered in an intro course
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);   // equivalent to a * 2
        System.out.println(a >> 1);   // equivalent to a / 2

        // Assignment
        int num = 10;
        num += 5;
        num *= 2;
        System.out.println(num);

        // Membership - no `in` keyword in Java
        System.out.println("Python".contains("P"));

        // Identity vs equality
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = list1;
        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(list1 == list2);        // same object
        System.out.println(list1 == list3);         // different objects
        System.out.println(list1.equals(list3));    // same content
    }
}
