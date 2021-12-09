package com.abc.assignment1;

public class Employee {
	private int empId;
	private String empmName;
	private String empDept;
	private String empAddress;
	private String empEmail;
	private int empSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpmName() {
		return empmName;
	}
	public void setEmpmName(String empmName) {
		this.empmName = empmName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	public void work() {
		System.out.println("Work");
	}
	public void eat() {
		System.out.println("Eat");
	}
	public void play() {
		System.out.println("Play");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
	public void getUp() {
		System.out.println("Get Up");
	}
	

}
