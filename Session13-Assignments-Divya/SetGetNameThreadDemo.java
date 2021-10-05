package com.abc.app1;

class ChildTHread extends Thread{
	public void run() {
		//defining job
		for(int i=0;i<=5;i++) {
			System.out.println("Child");
		}
	}
}
public class SetGetNameThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		ChildTHread t1 = new ChildTHread();
		System.out.println(t1.getName());
		t1.setName("divya");
		System.out.println(t1.getName());
		
		ChildTHread t2 = new ChildTHread();
		System.out.println(t2.getName());
		t2.setName("wow");
		System.out.println(t2.getName());
	}
}
