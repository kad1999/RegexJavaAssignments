final class Customer{
	private final int customerId;
	private final String customerName;
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public Customer modify(int custId, String custName) {
		if(this.customerName == custName && this.customerId==custId) {
			return this;
		}
		else {
			return new Customer(custId, custName);
		}
	}
	
	public String toString() {
		return customerId+ " "+customerName;
	}
	
}
public class Assignment1 {
	public static void main(String[] args) {
		Customer c = new Customer(1,"divya");
		Customer c1 = c.modify(2, "jones");
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		System.out.println(c.equals(c1));
	}
}
