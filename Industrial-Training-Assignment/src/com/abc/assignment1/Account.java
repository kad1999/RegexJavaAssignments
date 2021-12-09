package com.abc.assignment1;

public class Account {
	int accountNo;
	String holderName;
	String bankName;
	String accountType;
	double balance;
	
	public Account(int accountNo, String holderName, String bankName, String accountType, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.bankName = bankName;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	
	
	public void deposit(double amount) {
		System.out.println("Deposit");
		this.balance += amount;
	}
	public void withdraw(double amount) {
		System.out.println("withdraw");
		this.balance -= amount;
	}
	public void getAccountType() {
		System.out.println("Type = "+this.accountType);
	}
	public void getAccountBalance() {
		System.out.println("Balance = "+this.balance);
	}
	public void getAccountNo() {
		System.out.println("Account No = "+this.accountNo);
	}
	
}
