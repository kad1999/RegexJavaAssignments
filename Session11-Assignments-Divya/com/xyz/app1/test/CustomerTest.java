package com.xyz.app1.test;

import com.xyz.app1.model.*;
import com.xyz.app1.service.*;
public class CustomerTest {
	public static void main(String[] args) {
		CustomerService c = new CustomerService();
		Customer[] cList = c.getCustomer();
		
		for(Customer cl: cList) {
			System.out.println(cl);
		}
	}
	
}