package com.abc.assignment1;

public class Vehicle {
	//properties
	private int modelNo;
	private String name;
	private String vehicleCategory;
	private String fuelType;
	private String color;
	
	//getters and setters
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//methods
	public void open() {
		System.out.println("Open the vehicle door");
	}
	public void insertKey() {
		System.out.println("Insert key");
	}
	public void start() {
		System.out.println("Start");
	}
	public void move() {
		System.out.println("Move");
	}
	public void stop() {
		System.out.println("Stop");
	}
}
