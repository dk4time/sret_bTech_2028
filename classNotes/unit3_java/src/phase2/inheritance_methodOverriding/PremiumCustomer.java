package phase2.inheritance_methodOverriding;

public class PremiumCustomer extends Customer {

    // -----------------------------------
    // Private Variable (Encapsulation)
    // -----------------------------------
    private double discount;

    // -----------------------------------
    // Static Block
    // -----------------------------------
    /*
     * Static block executes once when class is loaded
     * (commented print kept for learning purpose)
     */
    static {
        // System.out.println("Premium Customer Static");
    }

    // -----------------------------------
    // Constructor
    // -----------------------------------
    /*
     * Calls parent constructor using super(name)
     * Initializes discount for premium customers
     */
    public PremiumCustomer(String name) {
        super(name);
        this.discount = 10; // default 10% discount
        // System.out.println("Premium Customer");
    }

    // -----------------------------------
    // Getter & Setter
    // -----------------------------------
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // -----------------------------------
    // Method Overriding (Business Logic)
    // -----------------------------------
    /*
     * Overridden billing method
     * Premium customer gets discount on bill amount
     *
     * billAmount * ((100 - discount) / 100)
     */
    @Override
    public void billing(double billAmount) {

        // Apply discount and store final bill amount
        this.setBillAmount(billAmount * ((100 - discount) / 100));

        System.out.println("Paid: " + this.getBillAmount());
    }

    // -----------------------------------
    // Overridden toString()
    // -----------------------------------
    @Override
    public String toString() {
        return "PremiumCustomer [discount=" + discount +
                ", name=" + getName() + "]";
    }
}
