package phase2.inheritance_methodOverriding;

public class EliteCustomer extends PremiumCustomer {

    // -----------------------------------
    // Private Variable
    // -----------------------------------
    private double rewardPoints;

    // -----------------------------------
    // Static Block
    // -----------------------------------
    static {
        // System.out.println("Elite Customer Static");
    }

    // -----------------------------------
    // Constructor
    // -----------------------------------
    /*
     * Calls PremiumCustomer constructor
     * Initializes reward points for elite customers
     */
    public EliteCustomer(String name) {
        super(name);
        rewardPoints = 100;
        // System.out.println("Elite Customer");
    }

    // -----------------------------------
    // Getter & Setter
    // -----------------------------------
    public double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    
    @Override
    public void billing(double billAmount) {
    	this.setBillAmount(billAmount * ((100 - this.getDiscount()) / 100) - this.rewardPoints);
    	this.rewardPoints = this.getBillAmount()/10;
    	System.out.println("Paid: " + this.getBillAmount());
    	System.out.println("Reward Points earned: " + this.rewardPoints);
    	
    	
    }

    // -----------------------------------
    // Overridden toString()
    // -----------------------------------
    @Override
    public String toString() {
        return "EliteCustomer [rewardPoints=" + rewardPoints +
                ", discount=" + getDiscount() +
                ", name=" + getName() + "]";
    }
}
