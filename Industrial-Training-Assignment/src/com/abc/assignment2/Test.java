package com.abc.assignment2;

public class Test {
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		
		Car car = new Car(99, 2003, engine);
		
		System.out.println(car);
		
	}
}
