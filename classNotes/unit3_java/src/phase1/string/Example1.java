package phase1.string;

public class Example1 {

    public static void main(String[] args) {

        // Creating object to call non-static methods
        Example1 obj = new Example1();

        // Uncomment one by one while teaching
        // obj.demo();
        // obj.concatenation();
        // obj.comparision();
        // obj.findString();
        // obj.conversion();
        // obj.printSubString();

        // -----------------------------------
        // Palindrome Check using StringBuffer
        // -----------------------------------
        int a = 1331;

        /*
         * Steps:
         * 1. Convert int to String
         * 2. Reverse using StringBuffer
         * 3. Convert back to Integer
         * 4. Compare with original number
         */
        if (a == Integer.valueOf(
                new StringBuffer(String.valueOf(a))
                        .reverse()
                        .toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // -----------------------------------
    // Substring & trim demonstration
    // -----------------------------------
    void printSubString() {

        String str1 = "  abcd   "; // length includes spaces

        // Removes leading and trailing spaces
        str1 = str1.trim();

        System.out.println("Substring from index 2: " + str1.substring(2));
        System.out.println("Substring from index 1 to 2: " + str1.substring(1, 3));
    }

    // -----------------------------------
    // String conversions
    // -----------------------------------
    void conversion() {

        String str1 = "good morning";
        String str2 = "Java is one of the best.";

        String fruits[] = {"apple", "banana", "orange"};

        // Convert to uppercase
        str1 = str1.toUpperCase();
        System.out.println("Upper case: " + str1);

        // Convert to lowercase
        str1 = str1.toLowerCase();
        System.out.println("Lower case: " + str1);

        // Convert String to char array
        char ch[] = str1.toCharArray();
        System.out.println("Second character: " + ch[1]);

        // Split string into words
        String words[] = str2.split(" ");
        System.out.println("3rd word: " + words[2]);

        // int to String
        int a = 125;
        String str3 = String.valueOf(a);
        System.out.println("No of digits in a: " + str3.length());

        // String to int
        int b = Integer.valueOf("1578");
    }

    // -----------------------------------
    // Searching inside String
    // -----------------------------------
    void findString() {

        String str1 = "Hellol Java";

        System.out.println("Index of 'e': " + str1.indexOf('e'));
        System.out.println("First 'l': " + str1.indexOf('l'));
        System.out.println("Second 'l': " +
                str1.indexOf('l', str1.indexOf('l') + 1));
        System.out.println("Last 'l': " + str1.lastIndexOf('l'));

        // If character not found → returns -1
        System.out.println("Index of 'z': " + str1.indexOf('z'));

        // Case-sensitive search
        System.out.println("Index of 'java': " + str1.indexOf("java"));

        System.out.println("Starts with Hi: " + str1.startsWith("Hi"));
        System.out.println("Ends with Python: " + str1.endsWith("Python"));
    }

    // -----------------------------------
    // String comparison
    // -----------------------------------
    void comparision() {

        String str1 = "apple";
        String str2 = "mango";
        String str3 = "APPLE";

        System.out.println("equals(): " + str1.equals(str3));
        System.out.println("equalsIgnoreCase(): " +
                str1.equalsIgnoreCase(str3));

        System.out.println("regionMatches(): " +
                "Hi Java".regionMatches(3, "Hello Java", 6, 4));

        System.out.println("regionMatches(ignore case): " +
                "Hi JAVA".regionMatches(true, 3, "Hello Java", 6, 4));

        System.out.println("compareTo(): " + str2.compareTo(str1));
        System.out.println("compareToIgnoreCase(): " +
                str1.compareToIgnoreCase(str3));
    }

    // -----------------------------------
    // String concatenation
    // -----------------------------------
    void concatenation() {

        String str1 = "Romeo";
        String str2 = "Juliet";
        String str3 = "Loves";

        // Using + operator
        String story = str1 + " " + str3 + " " + str2 + 100;
        System.out.println(story);

        // Using concat()
        story = str1.concat(" ").concat(str3).concat(" ").concat(str2);
        System.out.println(story);

        // Using join()
        System.out.println(String.join(" ", str1, str3, str2));
    }

    // -----------------------------------
    // String creation & immutability
    // -----------------------------------
    void demo() {

        String str1 = "Java is one of the best programming language";

        String str2 = new String();  // empty string
        String str3 = null;          // no object

        System.out.println("String 1: " + str1);
        System.out.println("Length: " + str1.length());

        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        String str4 = new String("Welcome");
        String str7 = new String("Welcome");

        System.out.println("Object comparison: " + (str4 == str7));
        System.out.println("Content comparison: " + str4.equals(str7));

        String a = "Java";
        String b = "Java";

        // String pool behavior
        System.out.println("String pool comparison: " + (a == b));

        System.out.println("First character: " + a.charAt(0));

        // Strings are immutable
        a = a.replace('J', 'j');
        System.out.println("Modified string: " + a);
    }
}
