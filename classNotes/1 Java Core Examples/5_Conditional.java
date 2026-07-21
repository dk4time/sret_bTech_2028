/*
 * Topic: Conditional Statements (decision-making)
 * Core idea: if/else works as expected, but Java's `switch` - both classic
 * and the modern (Java 14+) arrow form - is a genuinely distinct construct
 * worth knowing in its own right, not just an if-else substitute.
 */

public class Conditional {

    public static void main(String[] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        int marks = 76;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // Nested if
        String username = "admin", password = "1234";
        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Username");
        }

        // Ternary
        int num = 25;
        System.out.println((num > 0) ? "Positive" : "Negative");

        // Classic switch - `break` matters, or execution falls through
        int day = 3;
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            default: dayName = "Unknown";
        }
        System.out.println(dayName);

        // Modern switch expression (Java 14+) - no fall-through, produces a value
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };
        System.out.println(dayType);

        // Multiple conditions
        int salary = 45000, experience = 3;
        System.out.println((salary >= 40000 && experience >= 2) ? "Eligible" : "Not Eligible");
    }
}
