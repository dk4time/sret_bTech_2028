/*
 * Topic: Data Types
 * Core idea: Java has exactly 8 primitive types, each with a fixed size and
 * range. Wrapper classes, autoboxing, and widening/narrowing casts follow
 * directly from that design.
 */

public class Datatypes {

    public static void main(String[] args) {

        byte smallNumber = 100;                 // 8-bit
        short mediumNumber = 30000;              // 16-bit
        int num = 100000;                        // 32-bit
        long bigNumber = 10000000000L;           // 64-bit
        float price = 199.99f;                   // 32-bit
        double preciseValue = 199.99;            // 64-bit, Java's default decimal type
        boolean isActive = true;
        char grade = 'A';                        // single 16-bit Unicode character

        System.out.println(num + " " + bigNumber + " " + preciseValue);
        System.out.println(isActive + " " + grade);

        String language = "Java";                // reference type
        System.out.println(language);

        // Autoboxing / unboxing - what lets a primitive live inside a collection
        Integer boxedNum = num;
        int unboxedNum = boxedNum;
        System.out.println(boxedNum + " " + unboxedNum);

        // Widening (automatic) vs narrowing (explicit, can lose data)
        double widened = num;
        int narrowed = (int) 9.99;
        System.out.println(widened + " " + narrowed);

        // Parsing a String into a number
        int age = Integer.parseInt("25");
        System.out.println(age);

        // instanceof
        Object value = 99.5;
        System.out.println(value instanceof Double);

        // Only reference types can be null
        String result = null;
        System.out.println(result);
    }
}
