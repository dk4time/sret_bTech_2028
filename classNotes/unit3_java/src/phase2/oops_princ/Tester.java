package phase2.oops_princ;

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

        // ❌ private – NOT accessible
        // System.out.println(dk.mobile);
        // System.out.println(dk.laptop);

        // ✅ Access via getter
        System.out.println(dk.getLaptop());

        dk.setLaptop("MacBook");
        System.out.println(dk.getLaptop());

        // ✅ default – same package
        System.out.println(dk.house);

        // ✅ protected – same package
        System.out.println(dk.car);

        // ✅ public – everywhere
        System.out.println(dk.guestHouse);
    }
}
