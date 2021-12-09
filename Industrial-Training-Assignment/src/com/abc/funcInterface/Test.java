package com.abc.funcInterface;

@FunctionalInterface
interface MyFunctionalInterface{
	public abstract void getName(String name);
	
	public default void findSquare(int num) {
		System.out.println(num*num);
	}
	
}
class MyFuntionalIntefaceImpl implements MyFunctionalInterface{
	public void getName(String name) {
		System.out.println("Name = "+name);
	}
}

public class Test {
	public static void main(String[] args) {
		
		MyFunctionalInterface myFun = new MyFuntionalIntefaceImpl();
		myFun.getName("jay");
		myFun.findSquare(10);
	}
}
