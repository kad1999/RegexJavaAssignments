package com.abc.app1.model;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private String role;
	private String location;
	private String passport;
	
	public Employee() {
		
	}
	public Employee(int id, String name, String gender, String role, String location, String passport) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.role = role;
		this.location = location;
		this.passport = passport;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", role=" + role + ", location="
				+ location + ", passport=" + passport + "]";
	}

	
}
