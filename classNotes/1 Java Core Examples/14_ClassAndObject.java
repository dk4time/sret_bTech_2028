/*
 * Topic: Class and Object
 * Core idea: a class is a blueprint; an object is a specific instance built
 * from it, with its own copy of the instance fields. This is the foundation
 * every other OOPS file builds on.
 *
 * Real World Example: Student Management System
 */

public class ClassAndObject {

    static class Student {

        // Instance fields - each object gets its own copy
        int studentId;
        String name;
        String department;

        void display() {
            System.out.println(studentId + " " + name + " " + department);
        }
    }

    public static void main(String[] args) {

        // Creating objects and setting fields directly (constructors come next)
        Student student1 = new Student();
        student1.studentId = 101;
        student1.name = "John";
        student1.department = "MCA";
        student1.display();

        Student student2 = new Student();
        student2.studentId = 102;
        student2.name = "Alice";
        student2.department = "MCA";
        student2.display();

        // Two different objects, independent state
        System.out.println(student1 == student2);
        student2.name = "Alicia";
        System.out.println(student1.name + " " + student2.name);
    }
}
