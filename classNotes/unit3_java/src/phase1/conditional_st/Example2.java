package phase1.conditional_st;

public class Example2 {

    public static void main(String[] args) {

        // -----------------------------------
        // 1. Day Order Input
        // -----------------------------------
        int dayOrder = 5;

        /*
         * (dayOrder - 1) % 7
         * Converts any number into range 0–6
         * Example:
         * dayOrder = 1 → 0 → Sunday
         * dayOrder = 7 → 6 → Saturday
         * dayOrder = 8 → 0 → Sunday
         *
         * switch DOES NOT support float/double
         * Allowed types: byte, short, int, char, String, enum
         */

        // -----------------------------------
        // 2. Traditional switch with break
        // -----------------------------------
        switch ((dayOrder - 1) % 7) {

            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
        }

        System.out.println();

        // -----------------------------------
        // 3. switch WITHOUT break (Fall-through)
        // -----------------------------------
        switch ((dayOrder - 1) % 7) {

            case 's':   // ASCII value allowed (char → int)
            case 0:
                System.out.println("Sunday");

            case 2:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Thursday");

            case 6:
                System.out.println("Saturday");
                break; // stops execution here

            case 1:
                System.out.println("Monday");

            case 3:
                System.out.println("Wednesday");

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }

        /*
         * IMPORTANT:
         * - Missing break causes execution to continue
         * - This behavior is called FALL-THROUGH
         * - Common interview & MCQ trap
         */

        System.out.println();

        // -----------------------------------
        // 4. Enhanced switch (Java 14+)
        // -----------------------------------
        switch ((dayOrder - 1) % 7) {

            case 0, 's' -> {
                System.out.println("Sunday");
                System.out.println("It is a good day");
            }

            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6 -> System.out.println("Saturday");

            default -> System.out.println("Invalid day");
        }

        /*
         * Enhanced switch advantages:
         * - No break needed
         * - No fall-through by default
         * - Cleaner and safer
         */

        // -----------------------------------
        // 5. Ternary Operator
        // -----------------------------------
        char ch = 'm';

        // condition ? value_if_true : value_if_false
        String name = ch == 'm' ? "Dinesh" : "Divya";

        System.out.println("Name: " + name);

        // -----------------------------------
        // 6. switch as an Expression (Java 14+)
        // -----------------------------------
        String day = switch (dayOrder) {

	        case 1 -> "Sunday";
	
	        case 2 -> {
	            System.out.println("Day starts");
	            yield "Monday";
	        }
	
	        case 3 -> "Tuesday";
	
	        case 4 -> "Wednesday";
	
	        case 5 -> "Thursday";
	
	        case 6 -> "Friday";
	
	        case 7 -> "Saturday";
	
	        default -> "Invalid Day";
	    };

        System.out.println("Day: " + day);
    }
}
