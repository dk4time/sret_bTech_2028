/*
 * Topic: String
 * Core idea: Java Strings are immutable - every "modifying" method returns a
 * NEW String. Naive concatenation in a loop is therefore O(n^2); StringBuilder
 * exists specifically to fix that. That trade-off is the headline lesson.
 */

public class String_ {

    public static void main(String[] args) {

        String name = "Java Programming";
        System.out.println(name);

        // Immutability: replace() returns a new String, `name` is untouched
        String replaced = name.replace("Java", "Python");
        System.out.println(name + " | " + replaced);

        // Naive concatenation - a new String object every iteration
        String slow = "";
        for (int i = 0; i < 5; i++) {
            slow += i;
        }
        System.out.println(slow);

        // StringBuilder: mutable buffer built for exactly this
        // append(item) | StringBuilder | Params: item (Required) | Returns: StringBuilder | O(1) amortized
        StringBuilder fast = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            fast.append(i);
        }
        System.out.println(fast);

        // reverse() | StringBuilder | Params: None | Returns: StringBuilder | O(n)
        System.out.println(new StringBuilder(name).reverse());

        System.out.println(name.charAt(0));

        // substring(begin, end) - Java's slicing
        // String | Params: begin (Required), end (Optional) | Returns: String | O(n)
        System.out.println(name.substring(0, 6));

        System.out.println(name.toUpperCase());
        System.out.println("   Java   ".strip());

        // indexOf(str) | String | Params: str (Required) | Returns: int | O(n)
        System.out.println(name.indexOf("Programming"));

        System.out.println(name.startsWith("Java"));

        // split(regex) | String | Params: regex (Required) | Returns: String[] | O(n)
        System.out.println(java.util.Arrays.toString("Java Python JS".split(" ")));

        // String.join(delimiter, elements) | String (static) | Params: 2 Required | Returns: String | O(n)
        System.out.println(String.join(" | ", "Java", "Python", "C++"));

        System.out.println(name.contains("Java"));

        // Comparing strings - always .equals(), never == (reference identity)
        String a = new String("Java");
        String b = "Java";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
