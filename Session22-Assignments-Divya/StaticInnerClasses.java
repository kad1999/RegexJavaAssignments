class Outer1{
	static class Inner{
		public void m1() {
			System.out.println("static inner class");
		}
	}
}
public class StaticInnerClasses {
	public static void main(String[] args) {
		Outer1.Inner oi = new Outer1.Inner();
		oi.m1();
	}
}
