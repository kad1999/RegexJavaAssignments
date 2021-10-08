class Customer implements Cloneable{
	int customerId;
	String customerName;
	int customerContact;
	
	public Customer(int custId, String custName, int custContact) {
		this.customerId = custId;
		this.customerName = custName;
		this.customerContact = custContact;
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Assignment1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c = new Customer(1,"divya",98989);
		
		//deep cloning
		System.out.println("Deep cloning");
		Customer c1 = (Customer)c.clone();
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
		//shallow cloning
		System.out.println("Shallow cloning");
		Customer c2 = c;
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
	}
}
