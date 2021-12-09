package com.abc.multipleinh;

class TV{
	void sound() {
		System.out.println("Sound");
	}
	void picture() {
		System.out.println("Picture");
	}
}
class ThreeDTV extends TV{
	void ThreeD() {
		System.out.println("Three D");
	}
	void dolbyAudio() {
		System.out.println("Dolby Audio");
	}
}

class SmartTV extends ThreeDTV{
	void internet(){
		System.out.println("Connect to internet");
	}
	void fullHD() {
		System.out.println("Full HD");
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.println("Multiple Inheritance");
		TV tv = new TV();
		System.out.println("TV - ");
		tv.sound();
		tv.picture();
		
		ThreeDTV threeDtv = new ThreeDTV();
		System.out.println("ThreeD TV - ");
		threeDtv.sound();
		threeDtv.picture();
		threeDtv.ThreeD();
		threeDtv.dolbyAudio();
		
		SmartTV smartTv = new SmartTV();
		System.out.println("Smart TV - ");
		smartTv.sound();
		smartTv.picture();
		smartTv.ThreeD();
		smartTv.dolbyAudio();
		smartTv.internet();
		smartTv.fullHD();
		
	}
}
