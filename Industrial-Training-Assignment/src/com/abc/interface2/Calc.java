package com.abc.interface2;

interface Calc{
	int num1= 8;
	int num2 = 4;
	
	static void sum() {
		System.out.println("Sum = "+(num1+num2));
	}
	static void sub() {
		System.out.println("Difference = "+(num1-num2));		
	}
	static void mul() {
		System.out.println("Product = "+(num1*num2));
	}
	static void div() {
		System.out.println("Quotient = "+(num1/num2));
	}
}