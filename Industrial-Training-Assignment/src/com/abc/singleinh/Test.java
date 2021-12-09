package com.abc.singleinh;

class Car{
	public void move() {
		System.out.println("Move");
	}
	public void brake() {
		System.out.println("Brake");
	}
}

class Audi extends Car{
	public void autoPilot() {
		System.out.println("Auto Pilot");
	}
	public void autoGear() {
		System.out.println("Auto Gear");
	}
}


public class Test {
	public static void main(String[] args) {
		
		System.out.println("Single inheritance");
		Car car = new Car();
		System.out.println("Car methods - ");
		car.move();
		car.brake();
		
		System.out.println("Audi methods - ");
		Audi audi = new Audi();
		audi.move();
		audi.brake();
		audi.autoPilot();
		audi.autoGear();
	}
}
