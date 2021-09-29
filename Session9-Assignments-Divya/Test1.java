class Car{
	public void move() {
		System.out.println("Car moving");
	}
	public void brake() {
		System.out.println("Car braked");
	}
	
}

class Audi extends Car{
	public void autoPilot() {
		System.out.println("Autopilot");
	}
	public void autoGear() {
		System.out.println("Gear pilot");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Audi a = new Audi();
		a.move();
		a.brake();
		a.autoGear();
		a.autoPilot();
	}
}
