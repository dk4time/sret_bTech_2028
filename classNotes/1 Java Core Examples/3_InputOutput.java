/*
 * Topic: Input / Output
 * Core idea: Scanner is easy but slow. BufferedReader is the fast alternative
 * most placement-test and competitive Java solutions actually use. Both are
 * shown so students know which to reach for.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutput {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Java");

        String name = "John";
        int age = 22;
        System.out.println(name + " " + age);

        System.out.print("Hello ");
        System.out.println("World");

        System.out.printf("%s scored %d marks%n", "Alice", 95);

        // Scanner - simple, beginner friendly
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        System.out.println("Welcome " + inputName);
        scanner.close();

        // BufferedReader - fast, used for large input in competitive settings
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter salary (fast read): ");
        double salary = Double.parseDouble(reader.readLine());
        System.out.println("Salary: " + salary);

        System.out.print("Enter two numbers separated by a space: ");
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int first = Integer.parseInt(tokenizer.nextToken());
        int second = Integer.parseInt(tokenizer.nextToken());
        System.out.println("Sum: " + (first + second));
    }
}
