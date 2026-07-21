/*
 * Topic: Constructors
 * Core idea: a constructor runs once, at creation, to set up an object's
 * initial state. Java lets you overload constructors just like methods,
 * and one constructor can call another via this(...) to avoid repeating setup.
 */

public class Constructors {

    static class Student {

        int studentId;
        String name;
        String department;

        // Default constructor
        Student() {
            this(0, "Unknown", "Unassigned");
        }

        // Parameterized constructor
        Student(int studentId, String name) {
            this(studentId, name, "Unassigned");
        }

        // Constructor overloading - this(...) chains to the fullest version,
        // so the actual field-assignment logic exists in exactly one place
        Student(int studentId, String name, String department) {
            this.studentId = studentId;
            this.name = name;
            this.department = department;
        }

        void display() {
            System.out.println(studentId + " " + name + " " + department);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(101, "John");
        s2.display();

        Student s3 = new Student(102, "Alice", "MCA");
        s3.display();
    }
}
