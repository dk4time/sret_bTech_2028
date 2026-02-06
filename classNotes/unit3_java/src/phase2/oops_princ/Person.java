package phase2.oops_princ;

public class Person {

    // -----------------------------------
    // Access Modifiers on Variables
    // -----------------------------------

    private long mobile;          // accessible ONLY inside this class
    private String laptop;        // data hidden using encapsulation

    String house;                 // default (package-private)
    protected String car;         // accessible in same package + subclasses
    public String guestHouse;     // accessible everywhere

    // -----------------------------------
    // Default Constructor
    // -----------------------------------
    public Person() {}

    // -----------------------------------
    // Parameterized Constructor
    // -----------------------------------
    public Person(long mobile, String laptop, String house,
                  String car, String guestHouse) {

        this.mobile = mobile;
        this.laptop = laptop;
        this.house = house;
        this.car = car;
        this.guestHouse = guestHouse;
    }

    // -----------------------------------
    // Getter (Read Access)
    // -----------------------------------
    public String getLaptop() {
        return laptop;
    }

    // -----------------------------------
    // Setter (Write Access)
    // -----------------------------------
    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    // -----------------------------------
    // toString()
    // -----------------------------------
    @Override
    public String toString() {
        return "Person [mobile=" + mobile +
               ", laptop=" + laptop +
               ", house=" + house +
               ", car=" + car +
               ", guestHouse=" + guestHouse + "]";
    }
}
