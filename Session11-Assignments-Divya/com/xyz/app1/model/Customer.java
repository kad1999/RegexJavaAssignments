package com.xyz.app1.model;

public class Customer {
	private int customerId;
	private String customerName;
	private double customerBill;
	
	
	public Customer(int customerId, String customerName, double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
}
