class TV{
	public void sound() {
		System.out.println("TV Sound");
	}
	public void picture() {
		System.out.println("Picture");
	}
}

class ThreeDTV extends TV{
	public void threeD() {
		System.out.println("ThreeDTV");
	}
	public void dolbyAudio() {
		System.out.println("Dolby audio");
	}
}

class SmartTV extends ThreeDTV{
	public void Internet() {
		System.out.println("Internet");
	}
	public void fullHD() {
		System.out.println("Full HD");
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		SmartTV stv = new SmartTV();
		
		System.out.println("Smart TV");
		stv.sound();
		stv.picture();
		stv.threeD();
		stv.dolbyAudio();
		stv.Internet();
		stv.fullHD();
		
		System.out.println("Three DTV");
		ThreeDTV tdtv = new ThreeDTV();
		tdtv.sound();
		tdtv.picture();
		tdtv.dolbyAudio();
		tdtv.threeD();
		
		System.out.println("TV");
		TV tv = new TV();
		tv.sound();
		tv.picture();
	}
}
