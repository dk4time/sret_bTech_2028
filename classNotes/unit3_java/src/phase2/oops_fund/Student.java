package phase2.oops_fund;

import java.util.Arrays;

public class Student {

    // -----------------------------------
    // Static Variables (Class-level)
    // -----------------------------------
    static int roll;          // common counter for all students
    static String college;    // common property for all students

    // -----------------------------------
    // Instance Variables (Object-level)
    // -----------------------------------
    String rollNo;            // unique for each student
    String name;
    char gender;
    double marks[];           // array to store marks

    // -----------------------------------
    // Static Block
    // -----------------------------------
    /*
     * Executes once when the class is loaded
     * Used to initialize static variables
     */
    static {
        roll = 1000;
        college = "SRET";
    }

    // -----------------------------------
    // Constructor
    // -----------------------------------
    /*
     * Constructor is called when object is created
     * Used to initialize instance variables
     */
    public Student(String name, char gender) {

        // Auto-generate roll number
        rollNo = "e" + ++roll;

        // this refers to the current object
        this.name = name;
        this.gender = gender;

        // Allocate memory for marks array
        marks = new double[5];
    }

    // -----------------------------------
    // Instance Method (Behavior)
    // -----------------------------------
    /*
     * Calculates average marks of a student
     * Can access instance variables
     */
    double avgmark() {
        double sum = 0;

        for (double m : marks) {
            sum += m;
        }

        return sum / marks.length;
    }

    // -----------------------------------
    // Static Method
    // -----------------------------------
    /*
     * Static methods belong to class
     * Can access only static variables
     */
    static public void enquiry() {
        System.out.println("Admission Details");
        System.out.println("College: " + college);
    }

    // -----------------------------------
    // toString() Method
    // -----------------------------------
    /*
     * Called automatically when object is printed
     */
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo +
                ", name=" + name +
                ", gender=" + gender +
                ", marks=" + Arrays.toString(marks) +
                ", college=" + college + "]";
    }
}
