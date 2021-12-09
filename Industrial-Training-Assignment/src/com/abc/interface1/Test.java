package com.abc.interface1;

public class Test {
	public static void main(String[] args) {
		MyCalculator myCalc = new MyCalculator();
		myCalc.sum(4, 2);
		myCalc.sub(10, 7);
		myCalc.mul(91, 5);
		myCalc.div(18, 0);
	}
}
