package phase2.inheritance_methodOverriding;

public class Customer {

    // -----------------------------------
    // Instance Variables (Inherited by child)
    // -----------------------------------
    private String name;
    private double billAmount;

    // -----------------------------------
    // Static Block
    // -----------------------------------
    /*
     * Executes ONCE when class is loaded
     * Parent static block executes first
     */
    static {
        System.out.println("Customer Static");
    }

    // -----------------------------------
    // Constructor
    // -----------------------------------
    /*
     * Constructor initializes object
     * Called when object is created
     */
    public Customer(String name) {
        System.out.println("Customer Constructor");
        this.name = name;
    }

    public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// -----------------------------------
    // Instance Method
    // -----------------------------------
    public void billing(double billAmount) {

        this.billAmount = billAmount;
        System.out.println("Paid: " + billAmount);
    }

    // -----------------------------------
    // toString()
    // -----------------------------------
    @Override
    public String toString() {
        return "Customer [name=" + name +
               ", billAmount=" + billAmount + "]";
    }
}
