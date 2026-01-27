package phase2.oops_fund;

public class Tester {

    public static void main(String[] args) {

        // -----------------------------------
        // Local Variable
        // -----------------------------------
        int a;          // local variable must be initialized
        a = 0;
        System.out.println(a);

        // -----------------------------------
        // Reference Variable
        // -----------------------------------
        Student stu;    // reference created, no object yet

        // -----------------------------------
        // Accessing Static Members
        // -----------------------------------
        System.out.println(Student.college);
        Student.enquiry();

        // -----------------------------------
        // Creating Student Objects
        // -----------------------------------
        Student dk = new Student("Dineshkumar", 'M');
        System.out.println(dk);

        Student dd = new Student("Divya Dineshkumar", 'F');
        System.out.println(dd);

        Student ddd = new Student("Darwin Divya Dinesh", 'M');
        System.out.println(ddd);

        // Static method can be called using object reference
        // (Not recommended but allowed)
        ddd.enquiry();
    }
}
