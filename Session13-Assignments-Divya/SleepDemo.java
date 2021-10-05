package com.abc.app4;

class ChildThread extends Thread{
	public void run() {
		//defining job
		for(int i=0;i<=5;i++) {
			System.out.println("Child");
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class SleepDemo {
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread();
		t1.start();
		
	}
}
