package com.abc.interface1;

interface Calculator{
	void sum(int num1, int num2);
	void sub(int num1, int num2);
	void mul(int num1, int num2);
	void div(int num1, int num2);
}
public class MyCalculator implements Calculator{
	public void sum(int num1, int num2) {
		System.out.println("Sum = "+(num1+num2));
	}

	public void sub(int num1, int num2) {
		System.out.println("Difference = "+(num1-num2));		
	}

	public void mul(int num1, int num2) {
		System.out.println("Product = "+(num1*num2));
	}

	public void div(int num1, int num2) {
		if(num2 != 0)
			System.out.println("Division = "+(num1/num2));
		else
			System.out.println("Division by zero not possible");
	}
}
