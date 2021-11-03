class Mobile{
	public void call() {
		System.out.println("audio callung ");
	}
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.call();
		//anonymous inner class that extends a class
		Mobile m1 = new Mobile() {
			public void call() {
				System.out.println("Video call");
			}
		};
		m1.call();
		
		Mobile m2 = new Mobile() {
			public void call() {
				System.out.println("Audio+video");
			}
		};
		
		m2.call();
	}
}
