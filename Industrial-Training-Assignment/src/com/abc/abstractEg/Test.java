package com.abc.abstractEg;
abstract class Bank{
	abstract void openAccount();
	abstract void closeAccount();
}

class SBI extends Bank{
	void openAccount() {
		System.out.println("Open account");
	}


	void closeAccount() {
		System.out.println("Close account");	
	}
}

public class Test {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.openAccount();
		sbi.closeAccount();
	}
}
