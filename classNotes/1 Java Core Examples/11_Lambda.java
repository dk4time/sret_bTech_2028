/*
 * Topic: Lambda Expressions
 * Core idea: a Java lambda only compiles because it satisfies a functional
 * interface (exactly one abstract method). java.util.function gives you the
 * common shapes ready-made - Function, Predicate, Consumer, Supplier - so you
 * rarely need to define your own.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    record StudentScore(String name, int score) {}

    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));

        Consumer<String> printer = msg -> System.out.println("Log: " + msg);
        printer.accept("Lambda demo running");

        Supplier<String> greeting = () -> "Welcome to Java";
        System.out.println(greeting.get());

        // Comparator via lambda - the most common lambda use in placement code
        List<StudentScore> students = new ArrayList<>(List.of(
                new StudentScore("John", 85),
                new StudentScore("Alice", 92),
                new StudentScore("Bob", 78)
        ));
        students.sort((s1, s2) -> Integer.compare(s1.score(), s2.score()));
        System.out.println(students);

        // Comparator.comparing() - the more idiomatic way to write the same thing
        students.sort(Comparator.comparing(StudentScore::score).reversed());
        System.out.println(students);

        // Method references (::) - shorthand for a lambda that calls an existing method
        String[] words = {"banana", "kiwi", "apple", "watermelon"};
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
    }
}
