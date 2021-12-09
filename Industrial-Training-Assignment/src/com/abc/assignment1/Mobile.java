package com.abc.assignment1;

public class Mobile {
	int modelNo;
	String name;
	String type;
	String color;
	int storage;
	public Mobile(int modelNo, String name, String type, String color, int storage) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.type = type;
		this.color = color;
		this.storage = storage;
	}
	
	public void switchOn() {
		System.out.println("Switch on");
	}
	public void touch() {
		System.out.println("Touch");
	}
	public void volumeChange() {
		System.out.println("Change volume");
	}
	public void installApps() {
		System.out.println("Install apps");
	}
	public void switchOff() {
		System.out.println("Switch off");
	}
	
}
