package com.xyz.app1.service;
import com.xyz.app1.model.*;
public class CustomerService {
	
	private Customer c[] = new Customer[5];
	public CustomerService() {
		c = new Customer[] {
				new Customer(1,"karan",900.6),
				new Customer(2,"Divya", 899.6),
				new Customer(3,"hello", 4894.44),
				new Customer(4, "berlin", 595.4),
				new Customer(5,"tokyo", 905.2)
		};
		
	}
	public Customer[] getCustomer() {
		return c;
	}
}
