class Customer{
	int customerId;
	String customerName;
	int customerContact;
	
	
	public Customer(int customerId, String customerName, int customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}

	public int hashCode() {
		return customerId;
	}
	public String toString() {
		return customerId+" "+customerName+" "+customerContact;
	}
	public boolean equals(Object obj) {
		try {
			Customer c = (Customer)obj;
			if(this.customerName.equals(c.customerName) && this.customerId==c.customerId && this.customerContact==c.customerContact) {
				return true;
			}
			return false;
		} catch (ClassCastException e) {
				return false;
		}catch (NullPointerException e) {
			return false;
		}
	}
}

class Address{
	int pinCode;
	String city;
	String state;
	String country;
	
	public Address(int pinCode, String city, String state, String country) {
		super();
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int hashCode() {
		return pinCode;
	}
	
	public String toString() {
		return city+","+state+","+country+"-"+pinCode;
	}
	public boolean equals(Object obj) {
		try {
			Address a = (Address)obj;
			if(this.city.equals(a.city) && this.state.equals(a.state) && this.country.equals(a.country) && this.pinCode==a.pinCode) {
				return true;
			}
			return false;
		} catch (ClassCastException e) {
				return false;
		}catch (NullPointerException e) {
			return false;
		}
	}
	
}
public class Assignment {
	public static void main(String[] args) {
		Customer c = new Customer(1,"divya", 938392);
		Address a = new Address(33939,"kottayam","kerala","India");
		Customer c1 = new Customer(2,"rahul",98989);
		Address a1 = new Address(33939,"kottayam","kerala","India");
		
		System.out.println(c.toString());
		System.out.println(a.toString());
		
		System.out.println(c.hashCode());
		System.out.println(a.hashCode());
		
		System.out.println(c.equals(c1));
		System.out.println(a.equals(a1));
	}
}
