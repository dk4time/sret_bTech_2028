package phase2.inheritance_methodOverriding;

public class Tester {

    public static void main(String[] args) {

        /*
         * Object creation:
         * Static blocks → once per class
         * Constructors → every object creation
         */

        EliteCustomer ddd = new EliteCustomer("Darwin Divya Dinesh");
        EliteCustomer ddd1 = new EliteCustomer("Darwin Divya Dinesh");
        EliteCustomer ddd3 = new EliteCustomer("Darwin Divya Dinesh");
        
        Customer dk = new Customer("Dineshkumar");
		dk.billing(1000);

		
		PremiumCustomer dd = new PremiumCustomer("Divya Dineshkumar");
		dd.billing(1000);
		
		
		EliteCustomer ddd4 = new EliteCustomer("Darwin Divya Dinesh");
		ddd4.billing(1000);
    }
}
