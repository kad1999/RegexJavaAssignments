package com.abc.assignment1;

public class Student {
	private int studId;
	private String studName;
	private String studClass;
	private String StudAddress;
	private String StudEmail;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	public String getStudAddress() {
		return StudAddress;
	}
	public void setStudAddress(String studAddress) {
		StudAddress = studAddress;
	}
	public String getStudEmail() {
		return StudEmail;
	}
	public void setStudEmail(String studEmail) {
		StudEmail = studEmail;
	}
	
	
	public void study() {
		System.out.println("Study");
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
