package phase2.oops_princ2;

import phase2.oops_princ.Person;

public class Tester {

    public static void main(String[] args) {

        Person dk = new Person(
                9445750347L,
                "Dell",
                "DD",
                "Kwid",
                "DDD"
        );

        System.out.println(dk);

        // ❌ private – not accessible
        // System.out.println(dk.mobile);

        // ❌ default – not accessible
        // System.out.println(dk.house);

        // ❌ protected – not accessible without inheritance
        // System.out.println(dk.car);

        // ✅ public – accessible
        System.out.println(dk.guestHouse);
    }
}

