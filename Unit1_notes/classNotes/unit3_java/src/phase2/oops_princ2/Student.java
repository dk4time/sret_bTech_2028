package phase2.oops_princ2;

import phase2.oops_princ.Person;

public class Student extends Person {

    void display() {

        // ❌ private – not accessible
        // System.out.println(mobile);

        // ❌ default – not accessible outside package
        // System.out.println(house);

        // ✅ protected – accessible via inheritance
        System.out.println(car);

        // ✅ public – accessible everywhere
        System.out.println(guestHouse);
    }
}

